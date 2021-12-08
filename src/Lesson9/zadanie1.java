package Lesson9;

public class zadanie1 {
    public static void main(String[] args) {


        Book instrykcia = new Book("Instrycion", "Ivan", 200);
        Book fantastic = new Book("Fantastic", "Sania", 330);

        System.out.println(fantastic);
        System.out.println(instrykcia);


    }

}
//Создать класс, позволяющий хранить информацию о книге:
// название книги, автор, количество страниц. Создать в методе main две книги.
// Внутри класса создать метод
//public String toString()
//который возвращает строку, содержащую всю информацию о книге через пробелы.
// В классе main вывести информацию об этих двух книгах с помощью System.out.println(book1),
// System.out.println(book2)