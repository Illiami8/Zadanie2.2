package massiv;

public class zadanie3 {
    public static void main(String[] args) {
        int proiz = 1;
        int [] mass = { 1, 2, 3, 4, 5, -6, -7, -8, -9};
        for (int i = 0; i < mass.length; i++) {
            if(mass[i] > 0 && i % 2 != 0) {
                proiz = proiz * mass[i];
            }

        }
        System.out.println("произведение всех неотрицательных элементов стоящих на нечётных позициях = " + proiz);
    }
}
