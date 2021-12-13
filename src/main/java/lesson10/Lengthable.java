package lesson10;

public interface Lengthable extends Convertable {

    static void convLength(Length length) {
        switch (length) {
            case МИЛЛИМЕТРЫ -> System.out.println("миллиметры " + length);
            case САНТИМЕТРЫ -> System.out.println("Сантиметры " + length);
            case ДЕЦИМЕТРЫ -> System.out.println("дециметры " + length);
            case МЕТРЫ -> System.out.println("метры " + length);
            case КИЛОМЕТРЫ -> System.out.println("километры " + length);
            case NOSELECT -> System.out.println("не выбрали");
        }
    }
}
