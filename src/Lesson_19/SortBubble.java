package Lesson_19;

public class SortBubble {
    public static void main(String[] args) {
        int[] ints = {6, -4, 10, 12, -5, 0, 2, -4, 3, 7};
        print(ints);
        sort(ints);
        print(ints);
       int index = binarySearch(ints, 10);
        System.out.println(index);
    }

    public static void sort(int[] mass) {
        for (int i = 0; i < mass.length; i++) {
            for (int j = 1; j < mass.length - i; j++) {
                if (mass[j - 1] > mass[j]) {
                    int zagl = mass[j - 1];
                    mass[j - 1] = mass[j];
                    mass[j] = zagl;
                }
            }
        }
    }

    public static void print(int[] mass) {
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }
        System.out.println();
    }

    public static int binarySearch(int[] mass, int a) {
        int result = -1;
        int firstIndex = 0;
        int lastIndex = mass.length - 1;
        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (mass[middleIndex] == a) {
                result = middleIndex;
                break;
            } else if (mass[middleIndex] < a) {
                firstIndex = middleIndex + 1;
            }else {
                lastIndex = middleIndex - 1;
            }

        }
        return result;
    }
}
