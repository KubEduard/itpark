package lesson10;

public interface Lengthable extends Convertable {

    static void convLength(Length length) {
        switch (length) {
            case МИЛЛИМЕТРЫ -> System.out.println("перевод в миллиметры ");
            case САНТИМЕТРЫ -> System.out.println("перевод в сантиметры ");
            case ДЕЦИМЕТРЫ -> System.out.println("дециметры ");
            case МЕТРЫ -> System.out.println("метры ");
            case КИЛОМЕТРЫ -> System.out.println("километры ");
            case NOSELECT -> System.out.println("не выбрали");
        }
    }
}
