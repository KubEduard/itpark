package lesson2;

public class SecondProgram {

    public static void main(String[] args) {

        int summa = sum(9, 8);
        System.out.println(summa);

        int minus = sub(21, 9);
        System.out.println(minus);

        int multi = mult(5, 5);
        System.out.println(multi);

        int d = div(21, 7);
        System.out.println(d);

        int m = mod(21, 2);
        System.out.println(m);

    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) { return a - b; }

    public static int mult(int a, int b) { return a * b; }

    public static int div(int a, int b) { return a / b; }

    public static int mod(int a, int b) { return a % b; }

}
