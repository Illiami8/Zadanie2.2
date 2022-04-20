package Lesson_36;

import java.util.ArrayList;
import java.util.List;

public class PersonDemo {
    public static void main(String[] args) {
        Person ivan = new Person("Ivan", 10);
        Person igor = new Person("Igor", 15);
        Person vlad = new Person("Vlad", 20);


        List<Person> personList = new ArrayList<>();
        personList.add(ivan);
        personList.add(igor);
        personList.add(vlad);
        //  List<Person> children = filter(personList, person -> person.getAge() < 18);

        Printable toConsole;
        toConsole = System.out::println;
        // toConsole.print(children);


      //  for (Person child : filter(personList, person -> {
            //   return person.getAge() < 18;
      //  })) {
      //      System.out.println(child);
        }
    //   for (Person person : filter(personList,
     //          person -> person.getName().substring(0, 1).equals("V"))) {
      //      System.out.println(person);
        }


   // }

   // private static List<Person> filter(List<Person> personList, Searchable searchable) {
        //List<Person> children = new ArrayList<>();
        // for (Person person : personList) {
        //    if (searchable.test(person)) {
        //           children.add(person);
        //         }
        //   }
        //   return children;
        //}

        //   private static boolean isChild(Person person) {
        //  return person.getAge() < 18;
        //  }
   // }//
