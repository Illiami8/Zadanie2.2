package lesson_15DZ;

public class Remout {
    private Device[] devices = new Device[10];
    private int count = 0;

    public void turnOff() {
        for (int i = 0; i < count; i++) {
            devices[i].turnOff();
        }
    }

    public void turnOn() {
        for (int i = 0; i < count; i++) {
            devices[i].turnOn();
        }
    }

    public void getStutys() {
        for (int i = 0; i < count; i++) {
            devices[i].getStutys();
        }
    }

    public void add(Device device) {
        devices[count] = device;
        count++;
    }


}

