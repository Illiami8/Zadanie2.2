package yprag7;

public class zadanie2 {
    public static void main(String[] args) {
        int[] mass1 = {-2, 2, 1, 4, 1, -6, 1, 8, 1, 10};
        MinMax minn = mass(mass1);
        System.out.println(minn.max + "  " + minn.min);
    }

    static MinMax mass(int[] m) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < m.length; i++) {
            if (m[i] < min) {
                min = m[i];
            }
            if (m[i] > max) {
                max = m[i];
            }
        }
        MinMax result = new MinMax();
        result.max = max;
        result.min = min;
        return result;
    }
}
