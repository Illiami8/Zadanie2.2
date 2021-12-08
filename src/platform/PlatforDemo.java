package platform;

public class PlatforDemo {
    public static void main(String[] args) {
        Avto reno = new Avto("reno", 1200);
        Avto bmw = new Avto("BMW",1100);
        Avto[] avtos = {reno, bmw};
        Platform platform = new Platform(10000, avtos);
        System.out.println(platform.brutto());
    }
}
