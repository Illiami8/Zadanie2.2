package yprag5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class zadanie3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //int[] mass = new int[10];
        for (int i = 0; i < 10; i++ ) {
            String str = reader.readLine();
            int element = Integer.parseInt(str);
            //        mass[i] = element;
            if (element == 0) {

                System.out.println(" В массив веден 0 ");
                break;
            }
        }
    }
}
