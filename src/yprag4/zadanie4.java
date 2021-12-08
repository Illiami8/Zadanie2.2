package yprag4;

public class zadanie4 {
    public static void main(String[] args) {
        double[] massiv1 = {1.1, 2.2, 3.3, 4.4};
        double[] massiv2 = {1.2, 2.3, 3.4, 5.6, 7.8};
        int[] massiv3 = new int[massiv1.length];
        int[] massiv4 = new int[massiv2.length];
        for (int i = 0; i < massiv1.length; i++) {
            massiv3[i] = (int) massiv1[i];

        }
        for (int i = 0; i < massiv2.length; i++) {
            massiv4[i] = (int) massiv2[i];
        }
        for (int i = 0; i < massiv1.length; i++) {
            System.out.print(". " + massiv3[i]);
        }
        System.out.println();
        for (int i = 0; i < massiv2.length; i++) {
            System.out.print(". " + massiv4[i]);
        }
    }
}
