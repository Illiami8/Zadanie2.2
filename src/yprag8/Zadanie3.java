package yprag8;

public class Zadanie3 {
    public static void main(String[] args) {
        Person illia = new Person();
        illia.age = 23;
        illia.name = "Illia";
        Person vania = new Person();
        vania.age = 16;
        vania.name = "Vania";
        Person jena = new Person();
        jena.age = 22;
        jena.name = "Jena";
        Person Leha = new Person();
        Leha.age = 35;
        Leha.name = "Lesha";
        Person sanz = new Person();
        sanz.name = "Sana";
        sanz.age = 17;

        Person[] people = new Person[5];
        people[0] = illia;
        people[1] = vania;
        people[2] = jena;
        people[3] = Leha;
        people[4] = sanz;
        int count = sovers(people);
        System.out.println("количество человек, достигших совершеннолетия = " + count);

    }

    static int sovers(Person[] people) {
        int count = 0;
        for (int i = 0; i < people.length; i++) {
            if (people[i].age > 18) {
                count++;
            }
        }
        return count;
    }
}


// Создать класс Person с полями name и age.
// Создать массив из 5-ти объектов класса person (имена и возраста любые).
// Написать метод (он не будет в самом классе Person),
// который принимает массив Person и возвращает количество человек,
// достигших совершеннолетия. Напечатать в методе main это количество.