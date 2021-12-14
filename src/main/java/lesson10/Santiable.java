package lesson10;

public interface Santiable {

    default void convS(int length, int n) {
        switch (length) {
            case 1 -> System.out.println("При конвертации в миллиметры величина увеличится в 10 раз : " + n * 10);
            case 2 -> System.out.println("При конвертации в сантиметры величина не изменится : " + n);
            case 3 -> System.out.println("При конвертации в дециметры величина уменьшится в 10 раз : " + (float) n / 10);
            case 4 -> System.out.println("При конвертации в метры величина уменьшится в 100 раз : " + (float) n / 100);
            case 5 -> System.out.println("При конвертации в километры величина уменьшится в 100 000 раз : " + (float) n / 100000);
        }
    }
}
