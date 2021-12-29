package lessoon21;

public class MyInt implements Comparable<MyInt>{
    private int value;

    public MyInt(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "MyInt{" +
                "value=" + value +
                '}';
    }

    @Override
    public int compareTo(MyInt myInt) {
        return this.value - myInt.value;
//        if (this.value < myInt.value ){
//            return -1;
//         }else if(this.value > myInt.value ){
//            return 1;
//        } else {
//           return 0;
//        }
    }
}
