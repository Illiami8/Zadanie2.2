package yprag6;

public class zadanie1 {
    public static void main(String[] args) {
        int[] m1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = min(m1);
        System.out.println(sum);

    }
    static int min(int[] m1) {
        int min = 0;
        for (int i = 0; i < m1.length; i = i + 2) {
            min = min + m1[i];
        }
        return min;
    }
}
