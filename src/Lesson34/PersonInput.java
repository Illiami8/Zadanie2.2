package Lesson34;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PersonInput {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String name = reader.readLine();
            String ageStr = reader.readLine();
            int ageInt = Integer.parseInt(ageStr);
            Person ivan = null;
            try {
                ivan = new Person(name, ageInt);
            }catch (IllegalArgumentException e) {
                System.err.println(e.getMessage());
            }
            System.out.println(ivan);
        } catch (IOException e) {
            System.err.println("Не удалось Ввести");
            System.exit(1);
        }

    }
}
