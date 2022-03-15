package Lesson32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyOdd {
    public static void main(String[] args) {
        String input = "FileInput.txt";
        String out = "FileOut.txt";

        fileCopyOdd(input, out);

    }

    private static void fileCopyOdd(String input, String out) {
        try (FileInputStream is = new FileInputStream(input);
             FileOutputStream os = new FileOutputStream(out)) {
            byte[] buffer = new byte[4];
            int count;

            while ((count = is.read(buffer)) > 0) {
                int writeCount = 0;
                byte[] writeBuffer = new byte[count/2];
                if (writeBuffer.length == 0){
                    break;
                }
                for (int i = 0; i < buffer.length; i += 2) {
                    writeBuffer[writeCount++] = buffer[i];
                }
               os.write(writeBuffer,0,writeBuffer.length);//
            }
        } catch (IOException e) {
            System.err.println("Ошибка копирования файла");
            System.exit(1);
        }
    }
}
