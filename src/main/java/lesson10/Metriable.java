package lesson10;

public interface Metriable {

    default void convM(int length, int n) {
        switch (length) {
            case 1 -> System.out.println("При конвертации в миллиметры величина увеличивается в 1 000 раз : " + n * 1000);
            case 2 -> System.out.println("При конвертации в сантиметры величина увеличивается в 100 раз : " + n * 100);
            case 3 -> System.out.println("При конвертации в дециметры величина увеличивается в 10 раз : " + n * 10);
            case 4 -> System.out.println("При конвертации в метры величина не изменится : " + n);
            case 5 -> System.out.println("При конвертации в километры величина уменьшится в 1000 раз : " + (float) n / 1000);
        }
    }
}
