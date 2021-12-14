package lesson10;

public class Count implements Convertable, Milliable, Santiable, Deziable, Metriable, Kiloable {

    @Override
    public void print() {
        System.out.println("Из какой величины желаете конвертировать, введите число");
        System.out.println("1: миллиметр, 2: сантиметр, 3: дециметр, 4: метр, 5: километр");
    }

    @Override
    public void print1() {
        System.out.println("Ожидается ввод числа в диапазоне от 1 до 5 !");
    }

    @Override
    public void print2() {
        System.out.println("Введите положительное число для конвертации : ");
    }

   @Override
    public void conv(int length) {
        Convertable.super.conv(length);
    }

    @Override
    public void conv(int length, int n) {
        Milliable.super.conv(length, n);
    }

    @Override
    public void convD(int length, int n) {
        Deziable.super.convD(length, n);
    }

    @Override
    public void convS(int length, int n) {
        Santiable.super.convS(length, n);
    }

    @Override
    public void convM(int length, int n) {
        Metriable.super.convM(length, n);
    }

    @Override
    public void convK(int length, int n) {
        Kiloable.super.convK(length, n);
    }
}
