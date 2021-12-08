package yprag5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class zadanie5 {
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
        int sum ;
        sum = summa(mass);
        System.out.println("суммa элементов массива = " + sum);
        int srdn = srednee(mass);
        System.out.println("среднее арифметическое массива = "+ srdn);
        int otr = otric(mass);
        System.out.println("количество отрицательных элементов массива = " + otr );
    }

    static int summa(int[] m1) {
        int sum = 0;
        for (int i = 0; i < m1.length; i++) {
            sum = sum + m1[i];
        }
        return sum;
    }

    static int srednee(int[] m1) {
        int sredn = 1;
        int sum = 0;
        for (int i = 0; i < m1.length; i++) {
            sum = sum + m1[i];
        }
        sredn = sum / m1.length;
        return sredn;
    }

    static int otric(int[] m1) {
        int otr = 0;
        for (int i = 0; i < m1.length; i++) {
            if (m1[i] < 0 ){
                otr++;
            }

        }
        return otr;
    }
}
// Ввести массив с клавиатуры. Написать методы, которые возвращают: сумму элементов массива,
// среднее арифметическое массива, количество отрицательных элементов массива. В основном методе вызовите эти методы
// и напечайте значения, которые они возвращают.