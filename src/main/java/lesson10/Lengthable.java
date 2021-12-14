package lesson10;

public interface Lengthable extends Convertable {

    static void convLength(int length) {
        switch (length) {
            case 1 -> System.out.println("перевод в миллиметры ");
            case 2 -> System.out.println("перевод в сантиметры ");
            case 3 -> System.out.println("дециметры ");
            case 4 -> System.out.println("метры ");
            case 5 -> System.out.println("километры ");
            case 0 -> System.out.println("не выбрали");
        }
    }
}
