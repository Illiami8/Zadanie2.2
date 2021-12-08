package massiv;

public class zadanie2 {
    public static void main(String[] args) {
        int count = 0;
        int[] mass = {-11, -6, -8, 8, 7, -5, -5};
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] < 0 && i % 2 != 0) {
                count++;
            }
        }
        System.out.println("Количество всех отрицательных элементов стоящих на чётных позициях: " + count);
    }
}
