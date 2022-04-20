package Lesson32_dz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        String input = "task32.txt";
        fileCopyOdd(input);
    }

    private static void fileCopyOdd(String input) {
        try (FileInputStream is = new FileInputStream(input)) {
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
// Создайте некий входной файл с именем task32.txt.
// Заполните его произвольными данными. Представьте себе,
// что вам нужно перенести его на каких-то очень маленьких флешках размером в 10 байтов.
// Программа должна разбить этот файл на несколько маленьких файлов размером не более 10 байтов каждый.
// Названия выходных файлов пусть будут состоять из названия входного файла и далее пусть к
// ним приклеивается суффикс .part1, part 2 и т.д. Т.е, должны получиться файлы task32.txt_part1,
// task32.txt_part1 и т.д.