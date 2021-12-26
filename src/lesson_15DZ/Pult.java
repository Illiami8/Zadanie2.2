package lesson_15DZ;

public class Pult {
    public static void main(String[] args) {

        Teapot lg = new Teapot("LG");
        Lamp lamp = new Lamp("Philips");
        Tv tv = new Tv("Horizont");

        Remout dev = new Remout();
        dev.add(lg);
        dev.add(lamp);


        dev.turnOff();

        dev.getStutys();
        dev.add(tv);
        tv.turnOn();
        dev.getStutys();
        dev.turnOn();
    }
}
