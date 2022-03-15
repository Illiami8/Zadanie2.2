package lesson29_DZ;

import java.io.*;
import java.util.Random;

public class Gener {
    public static void main(String[] args) {
        int exrc = 20;
        int longg = 20;
        String fileName = "in.txt";
        Random random = new Random(1234);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            int[][] array = new int[100][20];
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    int line = randomInt(26, random);// от 97 до 122
                    line = line + 97;
                    char b = (char) line;
                    writer.write(b + "");

                }
                writer.newLine();
            }

        } catch (IOException e) {
            System.err.println("Ошибка работы с файлом");
            System.exit(1);
        }

    }

    private static int randomInt(int bound, Random random) {
        // Random random = new Random(1234);// seed - Зачем?
        return random.nextInt(bound);
    }


}
//Первая /пусть генерирует строки из маленьких латинских букв (от a до z)
// одинаковой длины, скажем, 20 символов. Пусть этих строк будет 100 и
// программа записывает их в файл.
//Помните, что можно сгенерировать число, а потом преобразовать его в
// char, а потом char, а из нескольких char-ов можно сделать строку.
// Сложность с которой вы столкнётесь — как сделать, чтобы сгенерированные числа лежали в диапазоне от
// десятичного числа, которое преобразуется в символ 'a', до десятичного числа, который преобразуется в 'z'.
//Также надо будет самостоятельно найти этот диапазон (или в интернете, или преобразуйте
// символ в число и так его узнаете)
//Выглядеть файл должен как-то так:
//
//lfkjsdflwoiepojsdlkf
//lkdfjsldkfjsldfkjsld
//gkfgjflskjdflksjdflk