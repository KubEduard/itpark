package lesson6;

import java.beans.PropertyEditorSupport;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.abs;

public class ArrayRoot {

    public static void main(String[] args) {

        System.out.println("Укажите длину массива");

        Scanner chislo = new Scanner(System.in);
        int n;
        do {
            System.out.println("Ожидается ввод числа больше 0 !");
            while (!chislo.hasNextInt()) {
                System.out.println("Ожидается ввод числа больше 0 !");
                chislo.next();
            }
            n = chislo.nextInt();
        } while (n < 1);

        int[] array = zapArray(n);
        System.out.println(Arrays.toString(array));
        int max = maxArray(array);
        System.out.println("Максимальное число массива равно: " + max);
        int min = minArray(array);
        System.out.println("Минимальное число массива равно: " + min);
        double avg = avgArray(array);
        System.out.println("Среднее значение массива равно: " + avg);

    }

    public static double avgArray(int[] array) {

        double rez = array[0];
        for (int i = 1; i < array.length; i++) {
            rez += array[i];
        }
        rez = (rez / array.length);
        return rez;
    }

    public static int minArray(int[] array) {

        int minim = array[0];
        for (int i = 1; i < array.length; i++) {
            if (minim > array[i]) {
                minim = array[i];
            }
        }
        return minim;
    }

    public static int maxArray(int[] array) {

        int m = array[0];
        for (int i = 1; i < array.length; i++) {
            if (m < array[i]) {
                m = array[i];
            }
        }
        return m;
    }

    public static int[] zapArray(int n) {

        int[] massiv = new int[n];
        for (int i = 0; i < n; i++) {
            massiv[i] = Math.round((float) Math.random() * 100);
        }
        return massiv;
    }

}

