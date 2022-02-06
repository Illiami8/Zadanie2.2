package lesson23_DZ;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DemoNumbers {
    public static void main(String[] args) {
        Numbers one = new Numbers(15);
        Numbers two = new Numbers(20);
        Numbers three = new Numbers(21);
        Numbers four = new Numbers(15);
        Set<Numbers> numbers= new HashSet<>();
        numbers.add(one);
        numbers.add(two);
        numbers.add(three);
        numbers.add(four);

        for(Numbers num : numbers){
            System.out.print(num.getValue()+"/");
        }
        System.out.println();

    }
}
   // Дан List целых чисел. Создать новую коллекцию целых чисел,
// содержащую только уникальные значения изначального листа.
// Вывести новую коллекцию на печать.
