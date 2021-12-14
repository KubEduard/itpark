package lesson10;

import java.util.Scanner;

public class LengthRunner {

    public static void main(String[] args) {

        Convertable convertable = new Count();
        Milliable milliable = new Count();
        Santiable santiable = new Count();
        Deziable deziable = new Count();
        Metriable metriable = new Count();
        Kiloable kiloable = new Count();

        Scanner chislo1 = new Scanner(System.in);
        Scanner chislo2 = new Scanner(System.in);
        Scanner chislo3 = new Scanner(System.in);

        convertable.print2();

        int n = chisloRez();

        convertable.print();
        convertable.print1();

        int a = chislo1Rez();

        convertable.conv(Length.proverka(a));
        convertable.print1();

        int b = chislo1Rez();

        // Делаю проверку на первое число и в зависимости от него делаю соответствующую конвертацию

        switch (a) {
            case 1 -> milliable.conv(Length.proverka(b), n);
            case 2 -> santiable.convS(Length.proverka(b), n);
            case 3 -> deziable.convD(Length.proverka(b), n);
            case 4 -> metriable.convM(Length.proverka(b), n);
            case 5 -> kiloable.convK(Length.proverka(b), n);
        }
    }

    private static int chislo1Rez() {
        Scanner chislo1 = new Scanner(System.in);
        while (!chislo1.hasNextInt()) {
            System.out.println("Ожидается ввод числа в диапазоне от 1 до 5 !");
            chislo1.next();
        }
        int c = chislo1.nextInt();
        if (c < 1) {
            System.out.println("Ожидается ввод числа в диапазоне от 1 до 5 !");
            return chislo1Rez();
        }
        return c;
    }

    private static int chisloRez() {

        Scanner chislo3 = new Scanner(System.in);
        while (!chislo3.hasNextInt()) {
            System.out.println("Ожидается ввод положительного числа");
            chislo3.next();
        }
        int c = chislo3.nextInt();
        if (c <= 0) {
            System.out.println("Ожидается ввод положительного числа");
            return chisloRez();
        }
        return c;
    }
}
