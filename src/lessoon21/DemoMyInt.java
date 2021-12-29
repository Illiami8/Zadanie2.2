package lessoon21;

import java.util.Arrays;

public class DemoMyInt {
    public static void main(String[] args) {
        MyInt[] array = {new MyInt(5), new MyInt(1), new MyInt(7)};
    print(array);
        Arrays.sort(array);
        print(array);
    }

    private static void print(MyInt[] array) {
        for (MyInt myInt : array) {
            System.out.print(myInt + " ");
        }
        System.out.println();
    }

}
