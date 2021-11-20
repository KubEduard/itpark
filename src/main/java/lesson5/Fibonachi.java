package lesson5;

import java.util.Scanner;

public class Fibonachi {

    public static void main(String[] args) {
        System.out.println("Вычисление значения в последовательности Фибоначчи");

        Scanner chislo = new Scanner(System.in);
        int n;
        do {
            System.out.println("Введите целое нетрицательное число");
            while (!chislo.hasNextInt()) {
                System.out.println("Ожидается ввод целого неотрицательного числа !");
                chislo.next();
            }
            n = chislo.nextInt();
        } while (n < 0);

        System.out.println("Вы ввели верное число " + n);
        chisloFibonachi(n);
    }

    public static int chisloFibonachi(int n) {

        if (n == 0) {
            System.out.println("Число Фибоначчи с индексом 0 равен 0");
            return 0;
        } else if (n == 1) {
            System.out.println("Число Фибоначчи с индексом 1 равен 1");
            return 1;
        }

        int rez1 = 0; int rez2 = 1; int rez = 0;

        for (int i = 2; i <= n; i++) {
            rez = rez1 + rez2;
            rez1 = rez2;
            rez2 = rez;
        }
        System.out.println("Число Фибоначчи с индексом " + n + " равен " + rez);
        return 1;
    }
}
