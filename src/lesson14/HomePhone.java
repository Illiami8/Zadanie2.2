package lesson14;

public class HomePhone extends Phone {
    private String buzzer;

    public HomePhone() {
        setName("Philips");
        setNumber("32223");
    }

    public HomePhone(String buzzer) {
        this.buzzer = buzzer;
    }

    public HomePhone(String name, String number, String buzzer) {
        super(name, number);
        this.buzzer = buzzer;
    }

    public void call() {
        //  super.call();
        System.out.println("Звенит звонок " + buzzer);
    }
}