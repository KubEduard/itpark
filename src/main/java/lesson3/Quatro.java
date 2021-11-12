package lesson3;

public class Quatro {

    public static void main(String[] args) {

        System.out.println("Решение квадратного уравнения ax^2 + bx + c = 0, ");
        int a = 2;
        int b = -5;
        int c = 3;
        System.out.println("где а = " + a + ", b = " + b + ", c = " + c);
        quatre(a, b, c);

    }

    public static int quatre(int a, int b, int c) {

        int d = b * b - 4 * a * c;
        if (d > 0) {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Дискриминант больше 0, уравнение имеет два корня х1 = " + x1 + ", x2 = " + x2);
            return 2;
        } else if (d == 0) {
            int x = -b / (2 * a);
            System.out.println("Дискриминант равен 0, уравнение имеет один корень х = " + x);
            return 1;
        } else
            System.out.println("Дискриминант меньше 0, нет действительных решений уравнения");
            return 0;
    }
}
