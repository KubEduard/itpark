package lesson10;

public interface Kiloable {

    default void convK(int length, int n) {
        switch (length) {
            case 1 -> System.out.println("При конвертации в миллиметры величина увеличится в 1 000 000 раз : " + n * 1000000);
            case 2 -> System.out.println("При конвертации в сантиметры величина увеличится в 100 000 раз : " + n * 100000);
            case 3 -> System.out.println("При конвертации в дециметры величина увеличится в 10 000 раз : " + n * 10000);
            case 4 -> System.out.println("При конвертации в метры величина увеличится в 1 000 раз : " + n * 1000);
            case 5 -> System.out.println("При конвертации в километры величина не изменится : " + n);
        }
    }
}
