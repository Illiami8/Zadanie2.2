package yprag8;

public class Zaadanie4 {
    public static void main(String[] args) {
        Person1 illia = new Person1("Illia", 23);
        Person1 gen = new Person1("Gena", 15);
        Person1 jenz = new Person1("jena", 20);
        Person1 Leha = new Person1("Leha", 35);
        Person1 sana = new Person1("Sanya", 33);
        Person1[] people = new Person1[5];
        people[0] = illia;
        people[1] = gen;
        people[2] = jenz;
        people[3] = Leha;
        people[4] = sana;

        int count = 0;
        for (int i = 0; i < people.length; i++) {
          if (people[i].soverh1() ){
              count++;
          }

        }
        System.out.println(count);
    }
}
//Используя класс Person из предыдущего задания,
// создать массив из 5 объектов класса person.
// Написать в классе Person метод, который возвращает true,
// если человек совершеннолетний, или false, если человек несовершеннолетний.
// В основном классе написать метод, который принимает массив Person и возвращает количество человек,
// достигших совершеннолетия. Напечатать в методе main это количество.