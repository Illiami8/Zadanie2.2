package Lesson9;

public class Person {

    String name;
    int age;
    static int adult ;

    Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

  static void setAdult(int zadAdult){
        adult = zadAdult;
  }

    boolean checkadult() {
        boolean check = false;
        if (age >=  adult) {
            check = true;
        }
        return check;
    }
}
