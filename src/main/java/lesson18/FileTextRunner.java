package lesson18;

import lombok.SneakyThrows;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class FileTextRunner {

    private static final String FILE_LOCATION = "/text.txt";

    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(Objects.requireNonNull(FileTextRunner.class.getResourceAsStream(FILE_LOCATION)),
                        StandardCharsets.UTF_8))) {
            final String extension = FilenameUtils.getExtension(FILE_LOCATION);
            AtomicInteger index = new AtomicInteger();
            bufferedReader.lines().filter(StringUtils::isNotBlank).forEach(line -> writeToFile(extension, index, line));
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    //filter(StringUtils::isNotBlank - проверка на не пустые и нулевые строки

    @SneakyThrows
    private static void writeToFile(String extension, AtomicInteger index, String line) {
        Files.writeString(Paths.get("C:\\test", "text" + index.incrementAndGet() + ".txt"),
                line, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
    }
}
