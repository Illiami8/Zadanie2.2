package massiv;

public class zadanie4 {
    public static void main(String[] args) {
        int[] mass1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] mass2 = new int[mass1.length];
        for (int i = mass1.length - 1; i >= 0; i--) {
            mass2[i] = mass1[i];
            System.out.print(mass2[i] + ". ");
        }
        System.out.println();
    }
}
