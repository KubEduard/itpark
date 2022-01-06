package lesson14;

import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ContactRunner {

    private static final Integer LIMIT = 2000;
    private static final Integer LIMIT_CONTACTS = 100;

    public static void main(String[] args) {

        Collection<ContactWithOthers> contactsSet = elementAndTime(ContactRunner::fillContactSet);
        Collection<ContactWithOthers> contactsList = elementAndTime(ContactRunner::fillContactList);

        long nowTime = System.currentTimeMillis();
        Contact[] contacts = fillContactArray();
        long seconds = System.currentTimeMillis() - nowTime;
        System.out.println("Время заполнения составило " + seconds + " миллисекунд");
        //System.out.println(Arrays.toString(contacts));

        //Collection<ContactWithOthers> contactsList = elementAndTime(ContactRunner::fillContactList);
        //ollection<ContactWithOthers> contactsSet = elementAndTime(ContactRunner::fillContactSet);

        System.out.println("Списки");
        fillLinkedContacts(contactsList);
        System.out.println("Множества");
        fillLinkedContacts(contactsSet);


        Map<Contact, Integer> mapOfContacts = contactsList.stream().map(ContactWithOthers::getLinkedContacts)
                .flatMap(Collection::stream)
                .collect(Collectors.toMap(Function.identity(), contact -> 1, Integer::sum));

        System.out.println(contactsList);

        mapOfContacts.entrySet().stream().max(Comparator.comparing(Map.Entry::getValue))
                .ifPresent(System.out::println);

    }

    private static void fillLinkedContacts(Collection<ContactWithOthers> contactsList) {
        long nowTime = System.currentTimeMillis();
        for (ContactWithOthers contact : contactsList) {
            IntStream.range(0, LIMIT_CONTACTS).boxed()
                    .map(i -> choiceElement(contactsList)).forEach(contact.getLinkedContacts()::add);
        }
        long spentTime = System.currentTimeMillis() - nowTime;
        System.out.println("Время заполнения связанных контактов из " + LIMIT_CONTACTS + " составило " + spentTime + " миллисекунд");
    }

    public static Collection<ContactWithOthers> elementAndTime(Supplier<Collection<ContactWithOthers>> supplier) {
        long nowTime = System.currentTimeMillis();
        Collection<ContactWithOthers> collection = supplier.get();
        long seconds = System.currentTimeMillis() - nowTime;
        System.out.println("Время заполнения составило " + seconds + " миллисекунд");
        return collection;
    }

    // Массивы
    private static Contact[] fillContactArray() {
        Contact[] contacts = new Contact[LIMIT];
        for (int i = 0; i < contacts.length; i++) {
            contacts[i] = new Contact();
        }
        System.out.println("Массивы");
        return contacts;
    }

    // Списки
    private static List<ContactWithOthers> fillContactList() {
        List<ContactWithOthers> contacts = new ArrayList<>(LIMIT);
        for (int i = 0; i <= LIMIT; i++) {
            contacts.add(new ContactWithOthers());
        }
        System.out.println("Списки");
        return contacts;
    }

    // Множества
    private static Set<ContactWithOthers> fillContactSet() {
        Set<ContactWithOthers> contacts = new HashSet<>(LIMIT);
        for (int i = 0; i <= LIMIT; i++) {
            contacts.add(new ContactWithOthers());
        }
        System.out.println("Множества");
        return contacts;
    }

    private static ContactWithOthers choiceElement(Collection<ContactWithOthers> collection) {
        int i = 0;
        int counter = new Random().nextInt(collection.size());
        for (ContactWithOthers contact: collection) {
            if (i == counter) {
                return contact;
            }
            i++;
        }
        throw new IllegalStateException("Как вы тут оказались???");
    }
}
