package lesson10;

public interface Convertable {

    void print();
    void print1();
    void print2();

    default void conv(Length length) {
        switch (length) {
            case МИЛЛИМЕТРЫ -> System.out.println("Вы желаете конвертировать миллиметры, выберите в какую длину: ");
            case САНТИМЕТРЫ -> System.out.println("Вы желаете конвертировать сантиметры, выберите в какую длину: ");
            case ДЕЦИМЕТРЫ -> System.out.println("Вы желаете конвертировать дециметры, выберите в какую длину: ");
            case МЕТРЫ -> System.out.println("Вы желаете конвертировать метры, выберите в какую длину: ");
            case КИЛОМЕТРЫ -> System.out.println("Вы желаете конвертировать километры, выберите в какую длину: ");
            case NOSELECT -> System.out.println("не выбрали");
        }
    }


}
