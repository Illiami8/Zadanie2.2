package yprag4;

public class zadanie1 {
    public static void main(String[] args) {
        int[] massiv1 = {1, 2, 3, 7};
        int[] massiv2 = {4, 6, 7, 1, 6};
        sredneearifMassiva(massiv1);
        sredneearifMassiva(massiv2);

    }

    static void sredneearifMassiva(int[] m1) {
        double summa = 0;
        double srednee ;
        for (int i = 0; i < m1.length; i++) {
            summa = summa + m1[i];
        }
        srednee = summa / m1.length ;
        System.out.println("Среднее среднее арифметическое массива " + srednee);

    }
}
