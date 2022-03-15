package lesson29_DZ;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;

public class GenerTwo {
    public static void main(String[] args) {
        String fileName = "in.txt";
        Set <Character> glass =Set.of('a', 'e', 'y','u', 'i','o');
        String st1  ;

        int chet = 0;
        char[] symbol = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            // for(int a = 0; a < 20; a++);

            while (reader.ready()) {
                st1= reader.readLine();
                System.out.println(st1);

                symbol = st1.toCharArray();
                for (char c : symbol)
                    if (glass.contains(c)) {
                        chet++;
                    }

            }

            System.out.println("кол-во гласных " + chet + " Кол-во согласных " + ((symbol.length * 100) - chet));
        } catch (IOException e) {
            System.err.println("Ошибка работы с файлом");
            System.exit(1);
        }
    }
}
// программа должна потом этот файл использовать,
// как входной, и вывести два числа, сколько в этом файле гласных букв,
// а сколько согласных. Ни в коем случае не городите switch из 26 вариантов,
// это кривое решение. Подумайте, как это можно сделать элегантнее.
//
//Вторая задача, наверное, проще, поэтому, кому сложно, сделайте только её. Но, смотрите сами.