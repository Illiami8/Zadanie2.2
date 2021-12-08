package yprag8;

public class Zadanie2 {
    public static void main(String[] args) {
        String[] mass = {"Hello", "This ", "is", "Example"};
        int[] massiv = massivchisel(mass);
        for (int i = 0; i < massiv.length; i++) {
            System.out.print(massiv[i] + " ");
        }
    }

    static int[] massivchisel(String[] m) {
        int[] mas2 = new int[m.length];
        for (int i = 0; i < mas2.length; i++) {
            mas2[i] = m[i].length();
        }
        return mas2;
    }
}
//. Задать в коде массив строк. Написать метод,
// который вернёт целочисленный массив длин этих строк.