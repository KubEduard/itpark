package lesson10;

public interface Milliable {

    default void conv(int length, int n) {
        switch (length) {
            case 1 -> System.out.println("При конвертации в миллиметры величина не изменяется : " + n);
            case 2 -> System.out.println("При конвертации в сантиметры величина уменьшится в 10 раз : " + (float) n / 10);
            case 3 -> System.out.println("При конвертации в дециметры величина уменьшится в 100 раз : " + (float) n / 100);
            case 4 -> System.out.println("При конвертации в метры величина уменьшится в 1 000 раз : " + (float) n / 1000);
            case 5 -> System.out.println("При конвертации в километры величина уменьшится в 1 000 000 раз : " + (float) n / 1000000);
        }
    }
}
