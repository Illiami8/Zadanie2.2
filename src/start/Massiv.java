package start;

public class Massiv {
    public static void main(String[] args) {
        int[] a = {7, 5, 8, 10, 5, 6};
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                count++;
            }

        }
        System.out.println("Кол-во четных эл-в : " + count);
    }
}
