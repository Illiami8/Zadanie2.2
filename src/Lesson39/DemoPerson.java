package Lesson39;

import java.util.List;
import java.util.stream.Collectors;

public class DemoPerson {
    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("Ivan", List.of(1000, 1000, 1100)),
                new Person("Igor", List.of(1500, 1550, 1400)),
                new Person("Sania", List.of(1200, 1300, 1250))
        );
        int sum = persons.stream()
                .flatMapToInt(person -> person.getSalaries().stream().mapToInt(value -> value))
                //.map(Person::getSalaries)
                // .forEach(System.out::println);
                //.collect(Collectors.toList());
              //  .mapToInt(value -> value.intValue())

              .sum();
    }
}

