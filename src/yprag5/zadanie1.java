package yprag5;

public class zadanie1 {
    public static void main(String[] args) {
        int[] mass = {-11, 12, -14, 15, 16};
        otr(mass);

    }

    static void otr(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                count++;
            }
        }
        System.out.println("Количество отрицательных элементов = " + count);
    }

}
