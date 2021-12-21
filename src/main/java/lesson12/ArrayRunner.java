package lesson12;

public class ArrayRunner {

    public static void main(String[] args) {
        Array array = new Array(4, 4);
        array.print();
        System.out.println("Сумма элементов матрицы равна " + array.summa());
    }
}
