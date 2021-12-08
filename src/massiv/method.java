package massiv;

public class method {
    public static void main(String[] args) {
         int[] massiv1 = {1, 3, 5, 7, 9};
         int[] massiv2 = {2, 4, 6, 8, 10};

         summaMassivov(massiv1, massiv2);

    }
    static void summaMassivov (int[] m1, int[] m2) {
        for (int i = 0; i < m1.length; i++) {
            System.out.print(m1[i] + m2[i] + " ");

        }
    }
}
