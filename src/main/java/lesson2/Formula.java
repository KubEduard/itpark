package lesson2;

public class Formula {

    public static void main(String[] args) {

        System.out.println("Расчет площади трапеции");

        /* Нахождение площади трапеции
        * S = (a + b) / 2 * h
        * a - длина первого основания
        * b - длина второго основания
        * h - высота */

        System.out.println("a = " + 6 + ", b = " + 10 + ", h = " + 4);
        int result = trapez(6, 10, 4);
        System.out.println("Площадь трапеции равна " + result);
    }

    public static int trapez(int a, int b, int h) {
        return (a + b) / 2 * h;
    }
}
