package lesson12;

public class MyArrayDataException extends RuntimeException {

    private final int numberRows;
    private final int numberColumns;

    public MyArrayDataException(int i, int j, String message) {
        super(String.format("%s. Ошибка произошла на строке %d и в столбце %d", message, i, j));
        this.numberRows = i;
        this.numberColumns = j;
    }
}
