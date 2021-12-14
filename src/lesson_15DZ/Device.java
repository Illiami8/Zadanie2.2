package lesson_15DZ;

public class Device {
    private String name;
    private String stutys;

    public Device(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String isStutys() {
        return stutys;
    }

    public void turnOn() {
        stutys = "Включен";
        System.out.println(name + " " + stutys);
    }

    public void turnOff() {
        stutys = "Выключен";
        System.out.println(name + "  " + stutys);
    }
     public void getStutys(){
         System.out.println(name + "  " + stutys );
     }
}
