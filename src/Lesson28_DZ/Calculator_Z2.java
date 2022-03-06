package Lesson28_DZ;

import java.io.*;

public class Calculator_Z2 {
    public static void main(String[] args) throws IOException {
        String file = "giveMeNumber.txt";
        String file1 = "giveMeSecondNumber.txt";
        BufferedWriter writer = null;
        BufferedWriter writer1 = null;

        String fileName = null;
        String fileName1 = null;
        fileName = "P:/учеба/input2.txt";//Пытался сделать проверку, но не понял как.
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String str1 = reader.readLine();
        String str = reader.readLine();
        String[] symbol = str.split(" ");
        String[] strokaTwo = str1.split(" ");
        String aString = null;
        String operation = null;
        String bString = null;

        String aStringTwo = null;
        String bStringTwo = null;
        String operationTwo = null;
        try {
            aString = symbol[0];
            operation = symbol[1];
            bString = symbol[2];

            aStringTwo = strokaTwo[0];
            bStringTwo = strokaTwo[2];
            operationTwo = strokaTwo[1];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Должно быть три Элемента");
            System.exit(1);
        }

        int a = Integer.parseInt(aString);
        int b = Integer.parseInt(bString);
        int a2 = Integer.parseInt(aStringTwo);
        int b2 = Integer.parseInt(bStringTwo);

        int answer = calc(a, operation, b);
        System.out.println(answer);
        int answer2 = calc(a2, operationTwo, b2);
        System.out.println(answer2);
        String ans = Integer.toString(answer);
        String ans1 = Integer.toString(answer2);

        try {
            writer = new BufferedWriter(new FileWriter(file));
            writer1 = new BufferedWriter(new FileWriter(file1));
            writer.write(ans);
            writer1.write(ans1);
        }catch (IOException e){
            System.out.println("Ошибка записи в файл");
        }finally {
            assert writer != null;
            writer.flush();
            writer1.flush();
            writer.close();
            writer1.close();
        }
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
//В файле не одна строка, а несколько.
//Посчитать и вывести результат нужно будет для каждой из строк.
//*пункт со звёздочкой – результаты выведите в файл calc_results.txt. Каждая строчка – отдельный результат