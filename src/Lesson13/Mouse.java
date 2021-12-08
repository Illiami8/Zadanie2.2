package Lesson13;

public class Mouse {
    private String name;
    private int x = 100;
    private int y = 100;

    public Mouse(String name){
        this.name = name;
    }

    public void moveLeft(int x){
        this.x = this.x - x;
    }

    public void moveRight(int x){
        this.x = this.x + x;
    }

    public int getX() {
        return x;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
