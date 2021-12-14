package lesson_15DZ;

public class Teapot extends Device {


    public Teapot(String name) {
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

    public void getStutys(){
super.getStutys();
    }
}
