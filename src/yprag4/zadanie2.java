package yprag4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class zadanie2 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите длину массива ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        int len = Integer.parseInt(str);
        int[] mass = new int[len];
        System.out.println("Введите элементы массива ");
        for (int i = 0; i < mass.length; i++) {
            String el = reader.readLine();
            int element = Integer.parseInt(el);
            mass[i] = element;
        }
        System.out.println("Введите Х");
        String str2 = reader.readLine();
        int x = Integer.parseInt(str2);
        proverkaX(mass, x);

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
