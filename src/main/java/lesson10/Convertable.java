package lesson10;

public interface Convertable {

    void print();
    void print1();
    void print2();

    default void conv(int length) {
        switch (length) {
            case 1 -> System.out.println("Вы желаете конвертировать миллиметры, выберите в какую длину: ");
            case 2 -> System.out.println("Вы желаете конвертировать сантиметры, выберите в какую длину: ");
            case 3 -> System.out.println("Вы желаете конвертировать дециметры, выберите в какую длину: ");
            case 4 -> System.out.println("Вы желаете конвертировать метры, выберите в какую длину: ");
            case 5 -> System.out.println("Вы желаете конвертировать километры, выберите в какую длину: ");
        }
    }
}
