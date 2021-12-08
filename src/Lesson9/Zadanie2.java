package Lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zadanie2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите заданный возраст совершенолетия ");

        String str = reader.readLine();
        int a = Integer.parseInt(str);

        Person zena = new Person("Zena", 15);
        Person gen = new Person("Gena", 44);
        Person jenz = new Person("jena", 31);
        Person Leha = new Person("Leha", 14);
        Person sana = new Person("Sanya", 11);
        Person.setAdult(a);
        Person[] people = {zena, gen, jenz, Leha, sana};

        for (int i = 0; i < people.length; i++) {
            if (people[i].checkadult()) {
                System.out.println(people[i].name);
            }
        }
    }
}


//В отдельном пакете создать класс Person (как в предыдущем домашнем задании).
// Кроме объектных полей (тех, которые нестатические), добавить статическое поле,
// в котором будем задавать возраст совершеннолетия. В классе должен быть метод для определения,
// совершеннолетний ли человек (похожим образом, как и в предыдущем задании). В классе, где находится main,
// создать массив из 5-ти объектов типа Person, задавая их возраста и имена в коде. С клавиатуры ввести возраст
// соврешеннолетия, передать его в класс Person и вывести список людей, являющихся совершеннолетними для введенного
// возраста совершеннолетия.