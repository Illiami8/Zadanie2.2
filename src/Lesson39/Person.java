package Lesson39;

import java.util.List;

public class Person {
    private String name;
    private List<Integer> salaries;

    public Person(String name, List<Integer> salaries) {
        this.name = name;
        this.salaries = salaries;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getSalaries() {
        return salaries;
    }

    public void setSalaries(List<Integer> salaries) {
        this.salaries = salaries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (!name.equals(person.name)) return false;
        return salaries.equals(person.salaries);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + salaries.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", salaries=" + salaries +
                '}';
    }
}
