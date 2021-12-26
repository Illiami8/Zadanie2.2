package lesson17_DZ;

public abstract class ArrayFigur {
    private Figure[] Array;
public double sum;
    public ArrayFigur() {
    }

    public Figure[] getArray() {
        return Array;
    }

    public void setArray(Figure[] array) {
        Array = array;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public void sumPlosch(Figure[] array) {
        for (int i = 0; i < Array.length; i++) {
            sum = sum + array[i].getPlocs();
        }
    }

    public void add(Figure Figure){

    }

}
