package yprag8;

public class Person1 {
    String name;
    int age;
    boolean soverh;

    Person1(String name, int age) {
        this.age = age;
        this.name = name;
    }

    boolean soverh1() {
        boolean soverrh = false;
        for (int i = 0; i < 5; i++) {
            if (age >= 18) {
                soverrh = true;
            }

        }
        return soverrh;
    }
}

