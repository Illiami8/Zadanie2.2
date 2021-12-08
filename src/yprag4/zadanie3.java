package yprag4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class zadanie3 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 4;
        int[] mass = new int[5];
        int[] mass2 = new int[mass.length];
        System.out.println("Введите элементы массива ");
        for (int i = 0; i < mass.length; i++) {
            String el = reader.readLine();
            int element = Integer.parseInt(el);
            mass[i] = element;
            mass2[count--] = element;

        }

        System.out.println("Массив: ");
        for (int i = 0; i < mass.length; i++) {
            System.out.print(" " + mass[i]);
        }
        System.out.println();
        System.out.println("Массив, в обратном порядке: ");
        for (int i = 0; i < mass.length; i++) {
            System.out.print(" " + mass2[i]);
        }
    }
}
