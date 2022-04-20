package Dz_Lesson37;

import Lesson_36.Person;
import Lesson_36.Searchable;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DemoProduct {
    public static void main(String[] args) {
        Product comp = new Product(141, "Comp", "Computer", 1500);
        Product phone = new Product(142, "Phone", "Mobile Phone", 800);
        Product modem = new Product(143, "Modem", "Sony", 300);
        List<Product> products = new ArrayList<>();
        products.add(comp);
        products.add(phone);

        Searchable<Product> searchableProduck = product -> product.getPrice() < 1000;
        Searchable<Person> searchablePerson = person -> person.getAge() > 25;
        List<Product> price = searchableProduck.filter(products, searchableProduck);
        System.out.println(price);
        List<Product> products1 = products.stream()
                .filter(product -> product.getPrice() < 1000)
                .collect(Collectors.toList());

        List<Person> persons = List.of(
                new Person("Ivan", 30),
                new Person("Illia", 24),
                new Person("Kolia", 40)
        );
        //filter(personList, person -> person.getAge() < 18);
        List<Person> personList = searchablePerson.filter(persons, searchablePerson);
    }
}
//
//Создать класс для хранения товаров с полями: инветаризационный номер, тип, название, цена.
//Создать несколько товаров (по 2-3 штуки) типов: компьютер, мобильный телефон, модем.
//Создать лист этих товаров.
//При помощи streamAPI отфильтровать компьютеры с ценой дешевле 1000 долларов. Должен получиться новый лист
//При помощи StreamAPI вывести отфильтрованные компьютеры на экран.
//При помощи StreamAPI вывести отфильтрованные компьютеры в файл computers.txt