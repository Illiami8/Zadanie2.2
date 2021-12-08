package yprag7;

public class zadanie1 {
    public static void main(String[] args) {
        int[] mass1 = {-2, 2, 1, 4, 1, -6, 1, 8, 1, 10};
        int min = min(mass1);
        System.out.println(min);
    }

    static int min(int[] m) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < m.length; i++) {
            if (m[i] < min) {
                min = m[i];
            }
        }
        return min;

    }
}