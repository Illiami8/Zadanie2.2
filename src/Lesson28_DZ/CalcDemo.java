package Lesson28_DZ;

import java.io.*;

public class CalcDemo {
    public static void main(String[] args) {
        String fileName = null;
        fileName = "P:/учеба/input2.txt";
        String str = null;
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(fileName));  //Зачем он нужен?
            str = reader.readLine();   // И это тоже зачем ???

        } catch (IOException e) {
            System.out.println("Ошибка чтения из файла " + fileName);
            System.exit(1);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    //Нечего делать.
                }
            }
        }
            String[] symbol = str.split(" ");

        String aString = null;
        String operation = null;
        String bString = null;

        try {
            aString = symbol[0];
            operation = symbol[1];
            bString = symbol[2];

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Должно быть три Элемента");
            System.exit(1);
        }

        int a = Integer.parseInt(aString);
        int b = Integer.parseInt(bString);
        int answer = calc(a, operation, b);
        System.out.print(answer);


    }

    private static int calc(int a, String oper, int b) {
        int result = 0;
        switch (oper) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            default:
                System.out.println("Действие не поддерживается");
                System.exit(1);
        }
        return result;
    }
}
