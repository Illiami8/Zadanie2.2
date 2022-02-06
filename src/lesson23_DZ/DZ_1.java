package lesson23_DZ;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DZ_1 {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        num.add(12);
        num.add(22);
        num.add(14);
        num.add(-1);
        num.add(22);
        System.out.println(num);

        Set<Integer> nums = new HashSet<>(num);
        print(nums);

        List<Integer> neCh = newList(num);
        System.out.println(neCh);
    }

    private static void print(Set<Integer> nums) {
        System.out.println(nums);
    }

    private static List<Integer> newList(List<Integer> num) {
        List<Integer> newLis = new ArrayList<>();
        for (Integer integer : num) {
            if (integer % 2 != 0) {
                newLis.add(integer);
            }
        }
        return newLis;
    }
}


// Дан List целых чисел. Создать новую коллекцию целых чисел,
// содержащую только уникальные значения изначального листа.
// Вывести новую коллекцию на печать.
//!2-Дан Set целых чисел.
// Создать новый Set или List,
// содержащий только нечётные числа из первого сета.

