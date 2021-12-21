package lesson12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Array {

    List<String> values = List.of("6", "8", "1", "16", "4", "5", "9", "3", "18", "2", "7", "4", "11", "15", "12", "17");
    //List<String> values = List.of("6", "8", "1", "16", "4", "5", "9", "3", "ю", ".", "7", "п", "11", "в", "12", "17");

    public static final int ROWS = 4;
    //public static final int ROWS = 2;
    public static final int COLUMNS = 4;

    private List<List<String>> variables;

    public  Array(int n, int m) {
        if (n != ROWS || m != COLUMNS) {
            throw new MyArraySizeException(n, m, "Произошла ошибка ввода матрицы 4 * 4");
        }
        this.variables = new ArrayList<>(n);
        inputIn(n, m);
    }

     public void inputIn(int n, int m) {
        for (int i = 0; i < n; i++) {
            List<String> rows = new ArrayList<>(m);
            this.variables.add(rows);
            for (int j = 0; j < m; j++) {
                int index = new Random().nextInt(values.size() - 1);
                rows.add(values.get(index));
            }
        }
    }

    public void print() {
        for (List<String> rows : this.variables) {
            System.out.println(rows);
        }
    }

    public int summa() {
        int rezult = 0;
        for (int i = 0; i < this.variables.size(); i++) {
            for (int j = 0; j < this.variables.get(i).size(); j++) {
                String value = this.variables.get(i).get(j);
                if (!value.matches("^(-*(\\d)+)$")) { //регулярное выражение - принимает все числа: отрицательные и положительные
                    throw new MyArrayDataException(i + 1, j + 1, "Некорректное значение, элементами массива должны быть числа");
                }
                rezult += Integer.valueOf(value);
            }
        }
        return rezult;
    }

}
