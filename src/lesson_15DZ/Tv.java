package lesson_15DZ;

public class Tv extends Device{

    public Tv(String name) {
        super(name);
    }

    public void tornOn(){
        super.turnOn();
        System.out.println(getName() + " " + isStutys() );
    }

    public void tornOff(){
        super.turnOff();
        System.out.println(getName() + " " + isStutys() );
    }
}
