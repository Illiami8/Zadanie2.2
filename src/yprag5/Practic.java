package yprag5;

public class Practic {
    public static void main(String[] args) {
        int[] m1 = {800, 500, 600, 1200};
        int[] m2 = {500, 300, 750, 500, 1500};
        double sredn1 = sredn(m1);
        double sredn2 = sredn(m2);
       sout(sredn1);
       sout(sredn2);
        System.out.println(" Общая зарплата " + (sredn1 + sredn2));
    }

    static void sout (double a){
        if (a > 500) {
            System.out.println("Мы богаты");
        } else {
            System.out.println(" Мы бедны ");
        }
    }

    static double sredn(int[] m1) {
        double sredn = 0;
        for (int i = 0; i < m1.length; i++) {
            sredn = m1[i] + sredn;
        }
        return sredn / m1.length;
    }
}
