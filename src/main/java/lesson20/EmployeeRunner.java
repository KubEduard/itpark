package lesson20;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.xml.bind.JAXB;
import lombok.SneakyThrows;
import org.glassfish.jaxb.runtime.api.TypeReference;
import org.json.XML;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import java.io.File;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class EmployeeRunner {

    private static final List<Department> DEPARTMENTS = List.of(new Department("ОиТ", "Уфа"),
        new Department("ОК", "Уфа"),
        new Department("ДБО", "Уфа"));

    private static final List<Post> POSTS = List.of(new Post("Директор", new BigDecimal(100000)),
            new Post("Главный специалист", new BigDecimal(70000)),
            new Post("Ведущий специалист", new BigDecimal(50000)));

    @SneakyThrows
    public static void main(String[] args) {
        EmployeeList employee = new EmployeeList(List.of(
            getEmployee("Иванов Иван Иванович"),
            getEmployee("Петров Петр Петрович"),
            getEmployee("Сидоров Олег Иванович")
        ));

        Path path = Paths.get("C:\\test\\employee.xml");
        if (!path.getParent().toFile().exists()) {
            path.getParent().toFile().mkdirs();
        }
        JAXB.marshal(employee, path.toFile());
        System.out.printf("Данные сохранены в папке %s в файле: %s\n ", path.getParent(), path.getFileName());
        Document document = getDocument(path.toFile());
        Integer averageSalary = getSalary(document);
        System.out.println("Поиск сотрудников с зарплатой выше среднего.");
        System.out.println("Средняя зарплата составляет: " + averageSalary);
        List<Employee> employeesList = searchEmployees(document, averageSalary);
        String json = XML.toJSONObject(String.join("", Files.readAllLines(path))).toString();
        Path jsonPath = path.getParent().resolve("employee.json");
        System.out.println("Сохранение данных в файл: " + jsonPath.getFileName());
        Files.writeString(jsonPath, json, StandardOpenOption.WRITE);


    }

    private static int value = 1;

    private static Employee getEmployee(String fio) {
        return new Employee().setTabNumber(new Random().nextInt(10_000) + "")
                .setLogin("user" + value++)
                .setFio(fio)
                .setDepartment(DEPARTMENTS.get(new Random().nextInt(DEPARTMENTS.size())))
                .setPost(POSTS.get(new Random().nextInt(POSTS.size())));
    }

    @SneakyThrows
    //Модули поиска сотрудников с зарплатой выше среднего
    private static List<Employee> searchEmployees(Document doc, int salary) {
        XPathFactory xPathFactory = XPathFactory.newInstance();
        NodeList nodeList = (NodeList) xPathFactory.newXPath().compile("//employee/post[@salary > " + salary + "]/ancestor::employee/fio").evaluate(doc, XPathConstants.NODESET);
        System.out.println("Список сотрудников с зарплатой выше средней");
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node item = nodeList.item(i);
            if (item.getNodeType() == Node.ELEMENT_NODE) {
                System.out.println(((Element) item).getTextContent());
            }
        }
        return Collections.emptyList();
    }

    // поиск среднего значения
    @SneakyThrows
    private static Integer getSalary(Document doc) {
        XPathFactory xPathFactory = XPathFactory.newInstance();
        Double result = ((Double) xPathFactory.newXPath().compile("sum(//post/@salary) div count(//post)").evaluate(doc, XPathConstants.NUMBER));
        return result != null ? result.intValue() : 0;
    }

    @SneakyThrows
    private static Document getDocument(File file) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = factory.newDocumentBuilder();
        return documentBuilder.parse(file);
    }
}
