package lesson10;

import java.util.Scanner;

public class LengthRunner {

    public static void main(String[] args) {

        Convertable convertable = new Count();
        convertable.print();

        Scanner chislo1 = new Scanner(System.in);
        Scanner chislo2 = new Scanner(System.in);

        convertable.print1();

        while (!chislo1.hasNextInt()) {
            convertable.print1();
            chislo1.next();
        }

        convertable.conv(Length.proverka(chislo1.nextInt()));

        convertable.print1();

        while (!chislo2.hasNextInt()) {
            convertable.print1();
            chislo2.next();
        }

        Lengthable.convLength(Length.proverka(chislo2.nextInt()));

    }
}
