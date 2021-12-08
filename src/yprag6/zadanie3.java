package yprag6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class zadanie3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] mass = new int[5];
        System.out.println("Введите элементы массива ");
        for (int i = 0; i < mass.length; i++) {
            String el = reader.readLine();
            int element = Integer.parseInt(el);
            mass[i] = element;
        }
        System.out.println("Введите Х");
        String str2 = reader.readLine();
        int x = Integer.parseInt(str2);
    }
    static void proverkaX (int [] m1, int x){
        int a = 0;
        for (int i = 0; i < m1.length; i++) {
            if (m1[i] == x ){
                a++;
            }
        }
        if (a > 0){
            System.out.println("Число " + x + "  содержится в массиве");
        }
        else {
            System.out.println("Числа " + x + " в массиве нет");
        }
    }
}
