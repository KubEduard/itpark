package lesson3;

import java.util.Scanner;

public class StepenChisla {

    public static void main(String[] args) {

        Scanner chislo = new Scanner(System.in);
        System.out.println("Вычисление факториала числа, n!");
        System.out.println("Введите целое фисло n");
        int n = chislo.nextInt();

        int factorial = fact(n);
        System.out.println("Факториал числа " + n + " = " + factorial);
    }

    public static int fact(int n) {

        if (n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }
}

