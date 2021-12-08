package Lesson13;

public class Computer {
    private String name;
    private Cursor cursor;
    private Mouse mouse;

    public Computer(String name) {
        this.name = name;
        cursor = new Cursor();
    }
    public void plugMouse(Mouse mouse){
        this.mouse = mouse;
    }

    public void getState(){
        int mouseX = mouse.getX();
        int cursorX = cursor.getX();
        cursor.setX(mouseX);
    }
    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", cursor=" + cursor +
                ", mouse=" + mouse +
                '}';
    }
}
