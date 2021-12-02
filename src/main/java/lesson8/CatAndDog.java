package lesson8;

public class CatAndDog {

    public static void main(String[] args) {
        Animals dog = new Dog("Dog", "Bobik", 1000, 300, "Гав-гав");
        Animals cat = new Cat("Cat", "Barsik", 100, 100, "Мяу-мяу");
        Animals chiken = new Chiken("Курица", "Ряба", 50, 0, "Ко-ко-ко-ко-ко");
        Animals cow = new Cow("Гусь", "Гусак", 0, 5000, "Га-га-га-га-га");
        Animals horse = new Horse("Лошадь", "Звездочка", 5000, 500, "Иииии-го-го");

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(chiken);
        System.out.println(cow);
        System.out.println(horse);
        System.out.println("-----------------------");

        Animals[] animalsi = new Animals[] {dog, cat, chiken, cow, horse};
        for (Animals animals: animalsi) {
            animals.getVoice();
            System.out.println(animals.getVoice());
        }

    }
}
