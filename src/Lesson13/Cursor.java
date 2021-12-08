package Lesson13;

public class Cursor {
    private int x = 100;
    private int y = 100;

    public int getX() {
        return x;
    }

    public void setX(int x) {
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
        return "Cursor{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
