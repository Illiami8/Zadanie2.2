package lesson23_DZ;

public class Numbers {
    private int value;

    public Numbers(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Numbers numbers = (Numbers) o;

        return value == numbers.value;
    }

    @Override
    public int hashCode() {
        return value;
    }
}
