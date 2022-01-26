package lesson22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoFindInArray {
    public static void main(String[] args) throws IOException {

        int[] mass = new int[5];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < mass.length; i++) {
            String str = reader.readLine();
            int number = Integer.parseInt(str);
            mass[i] = number;
        }
        String str1 = reader.readLine();
        int numberFind = Integer.parseInt(str1);

        boolean result = find(mass, numberFind);
        if (result) {
            System.out.println("Такое число в массиве есть");
        } else {
            System.out.println("Такого числа в массиве нету");
        }
    }

    private static boolean find(int[] mass, int number) {
        boolean result = false;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == number) {
                result = true;
                break;
            }
        }
        return result;
    }
}
