package lesson17_DZ;

public class DemoFigures {
    public static void main(String[] args) {
        Figure krug = new circle("Kryg", 6.1);
        Rectangle rectangle = new Rectangle("Прямоугольник", 12, 5);
        Square square = new Square("Квадрат", 7);
        double sum = 0;
        System.out.println(rectangle.getPlocs());
        krug.getPlocs();
        System.out.println(krug.getPlocs());
        Figure[] arrayFigur = {krug, rectangle, square};
        for (Figure figure : arrayFigur) {
            System.out.println(figure.getPlocs());
            sum = figure.getPlocs() + sum;
        }
        System.out.println("Сумма всех площадей = " + sum);
        System.out.println("Всего краски " + sum * 2);
    }
}

