package yprag8;

public class zadanie1 {
    public static void main(String[] args) {
        int[] m1 = {-11, 10, -5, 5};
        PologAndOtr m = pologAndOtr(m1);
        System.out.println(m.pologit + " + " + m.otric);

    }

    static PologAndOtr pologAndOtr(int[] m) {
        int pologiteln = 0;
        int otric = 0;
        for (int i = 0; i < m.length; i++) {
            if (m[i] > 0) {
                pologiteln = pologiteln + m[i];
            } else if (m[i] < 0) {
                otric = otric + m[i];
            }
        }
        PologAndOtr result = new PologAndOtr();
        result.pologit = pologiteln;
        result.otric = otric;
        return result;
    }
}
// Задать в коде целочисленный массив.
// Написать метод, который вернёт в одном объекте две
//   суммы: положительных элементов массива и отрицательных элементов массива.
