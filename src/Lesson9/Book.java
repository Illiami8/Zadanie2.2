package Lesson9;

public class Book {
    String name;
    String avtor;
    int pageCount;


    Book(String name, String avtor, int pageCount) {
        this.name = name;
        this.avtor = avtor;
        this.pageCount = pageCount;
    }

    public String toString() {
        String info = name + " " + avtor + " " + pageCount;
        return info;
    }

}

////public String toString()
////который возвращает строку, содержащую всю информацию о книге через пробелы.