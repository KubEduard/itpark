package lesson12;

import static lesson12.Array.*;

public class MyArraySizeException extends RuntimeException{

    private final int numberRows;
    private final int numberColumns;

    public MyArraySizeException(int numberRows, int numberColumns, String message) {
        super(message + ". Количество строк ожидалось " + ROWS + ", количество колонок - " + COLUMNS);
        this.numberRows = numberRows;
        this.numberColumns = numberColumns;
    }
}
