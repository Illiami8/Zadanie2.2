package massiv;

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
        int a = 0;
        int b = 0;
        int c = 0;

        System.out.println("Введите элементы массива ");
        for (int i = 0; i < mass.length; i++) {
            String el = reader.readLine();
            int element = Integer.parseInt(el);
            mass[i] = element;
            if (mass[i] > 0) {
                a++;
                //    pol[i] = mass[i];
            } else if (mass[i] < 0) {
                b++;
                //  otr [i] = mass[i];
            } else {
                c++;
                // nul[i] = mass[i];
            }
        }
        int[] pol = new int[a];
        int[] otr = new int[b];
        int[] nul = new int[c];
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > 0) {
                pol[i] = mass[i];
            }

        }
        for (int i = 0; i < mass.length; i++){
            if (mass[i] < 0) {
                otr[i] = mass[i];
            }
        }
        for (int i = 0; i < a; i++) {
            System.out.print( pol[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < b; i++){
            System.out.print(  otr[i] + " ");
        }
        System.out.println();
        for (int i = 0 ; i < c; i++){
            System.out.println(nul[i] + " " );
        }
    }
}
