package lesson14;

import java.util.Collection;
import java.util.HashSet;

public class Contact {

    private final String name;
    private final String surname;
    private final String phone;

    public  Contact() {
        this(Fio.randomName(), Fio.randomSurname(), PhoneUtils.generatePhone());
    }

    public Contact(String name, String surname, String phone) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
