package lesson24;

public class Field {
    private String x;
    private int y;

    public Field(String x, int y) {
        this.x = x;
        this.y = y;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Field{" +
                "x='" + x + '\'' +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Field field = (Field) o;

        if (y != field.y) return false;
        return x.equals(field.x);
    }

    @Override
    public int hashCode() {
        int result = x.hashCode();
        result = 31 * result + y;
        return result;
    }
}
