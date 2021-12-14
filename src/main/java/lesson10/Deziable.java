package lesson10;

public interface Deziable {

    default void convD(int length, int n) {
        switch (length) {
            case 1 -> System.out.println("При конвертации в миллиметры величина увеличивается в 100 раз : " + n * 100);
            case 2 -> System.out.println("При конвертации в сантиметры величина увеличивается в 10 раз : " + n * 10);
            case 3 -> System.out.println("При конвертации в дециметры величина не изменится : " + n);
            case 4 -> System.out.println("При конвертации в метры величина уменьшится в 10 раз : " + (float) n / 100);
            case 5 -> System.out.println("При конвертации в километры величина уменьшится в 10 000 раз : " + (float) n / 10000);
        }
    }
}
