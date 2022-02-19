package lesson28;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PrintFileDemo {
    public static void main(String[] args) {
        String fileName = "P:/учеба/input1.txt";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            while (reader.ready()) {
                System.out.println(reader.readLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден " + fileName);
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла");
        }
    }
}

