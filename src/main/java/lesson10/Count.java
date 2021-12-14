package lesson10;

public class Count implements Convertable, Lengthable {

    @Override
    public void print() {
        System.out.println("Введите величину (цифрами), которую желаете конвертировать");
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
}
