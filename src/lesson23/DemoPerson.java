package lesson23;

import java.util.HashSet;
import java.util.Set;

public class DemoPerson {
    public static void main(String[] args) {
        Person vania = new Person("Ivan", "Petrov");
        Person igor = new Person("Igor", "Vasilev");
        Person fedor = new Person("Fedor", "Ivanov");
        Person fedor2 = new Person("Fedor", "Ivanov");

        Set<Person> people = new HashSet<>();
        people.add(vania);
        people.add(igor);
        people.add(fedor);
        people.add(fedor2);

        for (Person person : people) {
            System.out.println(person);

        }

    }
}
