package massiv;

public class zadanie1 {
    public static void main(String[] args) {
        int count = 0;
        int[] mass = {10, 5, -9, 8, -5, 5, -2};
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] < 0) {
                count++;
            }
        }
        System.out.println("Количество отрицательных эл-тов = " + count);

    }
}
