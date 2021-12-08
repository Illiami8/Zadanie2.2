package start;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class zadanie5 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите  числа");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str = reader.readLine();
        String str1 = reader.readLine();
        String str3 = reader.readLine();

        int a = Integer.parseInt(str);
        int b = Integer.parseInt(str1);
        int c = Integer.parseInt(str3);
        if ((a > b && a < c)||(a < b && a > c) ) {
            System.out.println("Среднее Число :" + a );
        }

        else if (( b > a && b < c) ||(b < a && b > c ) ){
            System.out.println("Среднее Число " + b );
        }
        else if ((c > a && c < b) || ( c < a && c > b ) ){
            System.out.println("Среднее Число " + c );

        }
    }
}
