package yprag5;

public class yprag2 {
    public static void main(String[] args) {
        int[] mass = {11, 12, 14, 15, 16};
        sort(mass);

    }

    static void sort(int[] a) {
        boolean otric = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                otric = true;
            }

        }
        if (otric ) {
            System.out.println("Отрицательное число существует в массиве ");
        } else {
            System.out.println("Отрицательное число не содержится в массиве");
        }


    }
}

