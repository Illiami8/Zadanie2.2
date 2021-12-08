package start;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите два числа");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str = reader.readLine();
        String str1 = reader.readLine();
        int a = Integer.parseInt(str);
        int b = Integer.parseInt(str1);
        if (a > b) {
            System.out.println("Число "+ a + " > " + "Числa" + b );
        }
       else {
            System.out.println("Число " + a + " < " + "Числa " + b);
        }
    }
}
