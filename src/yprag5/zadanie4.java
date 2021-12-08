package yprag5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class zadanie4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] mass = new int[6];
        for (int i = 0; i < mass.length; i++) {
            String str = reader.readLine();
            int element = Integer.parseInt(str);
            mass[i] = element;
        }
        System.out.println("Второй массив = ");
        int index = 0;
        int[] mass2 = new int[mass.length / 2];
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] % 2 != 0) {
                mass2[index] = mass[i];
                index++;
            }
        }
        for (int i = 0; i < mass2.length; i++) {
            System.out.print(mass2[i] + ".");
        }
    }
}
