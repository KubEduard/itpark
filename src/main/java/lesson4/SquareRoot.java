package lesson4;

import java.lang.annotation.Retention;
import java.util.Scanner;

public class SquareRoot {

    public static void main(String[] args) {
        System.out.println("Вычисление квадратного корня числа");

        Scanner chislo = new Scanner(System.in);
        int n;
        do {
            System.out.println("Введите целое число больше 0");
            while (!chislo.hasNextInt()) {
                System.out.println("Ожидается ввод целого числа больше 0 !");
                chislo.next();
            }
            n = chislo.nextInt();
        } while (n < 1);

        System.out.println("Вы ввели верное число " + n);
        quatreRoot(n);
    }

    public static int quatreRoot(int n) {

        if (n == 1) {
            System.out.println("Квадратный корень 1 равен 1");
        }

        for (int i = 2; i < n; i++) {
            if ( (i * i) > n ) {
                System.out.println("Квадратный корень из числа " + n + " имеет не целое число");
                return 0;
            } else if ((i * i) == n) {
                System.out.println("Квадратный корень числа " + n + " равен " + i);
                return 1;
            }
        }
        return 1;
    }
}
