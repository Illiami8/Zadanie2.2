package lesson_27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringReverseDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        String[] symbols = str.split("");
        String reversedString = string(symbols);
        System.out.println(reversedString);

    }

    private static void print(String[] mass) {
        for (String str : mass) {
            System.out.print(str + " . ");
        }
    }

    private static String string(String[] mass) {
        //String stroka = "";
        StringBuilder sb = new StringBuilder();
        for (int i = mass.length-1; i >= 0; i--) {
            sb.append(mass[i]) ;
           // s += mass[i];
        }
        return sb.toString();
    }
}
