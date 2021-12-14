package lesson_15DZ;

public class Lamp extends Device{


    public Lamp(String name) {
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
