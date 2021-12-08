package Lesson13;

public class ComputerDemo {
    public static void main(String[] args) {
        Computer mac = new Computer("Mac");
        System.out.println(mac);
        Mouse mouse = new Mouse("x7");
        mac.plugMouse(mouse);
        System.out.println(mac);
        mouse.moveLeft(15);
        mac.getState();
        System.out.println(mac);
    }
}
