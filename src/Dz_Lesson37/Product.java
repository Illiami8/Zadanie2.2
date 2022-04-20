package Dz_Lesson37;

public class Product {
    private int number;
    private String type;
    private String name;
    private int price;

    public Product(int number, String type, String name, int price) {
        this.number = number;
        this.type = type;
        this.name = name;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (number != product.number) return false;
        if (price != product.price) return false;
        if (type != null ? !type.equals(product.type) : product.type != null) return false;
        return name != null ? name.equals(product.name) : product.name == null;
    }

    @Override
    public int hashCode() {
        int result = number;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + price;
        return result;
    }

    @Override
    public String toString() {
        return "Product{" +
                "number=" + number +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

//Создать класс для хранения товаров с полями: инветаризационный номер, тип, название, цена.
//Создать несколько товаров (по 2-3 штуки) типов: компьютер, мобильный телефон, модем.
//Создать лист этих товаров.
//При помощи streamAPI отфильтровать компьютеры с ценой дешевле 1000 долларов. Должен получиться новый лист
//При помощи StreamAPI вывести отфильтрованные компьютеры на экран.
//При помощи StreamAPI вывести отфильтрованные компьютеры в файл computers.txt