package lesson14;

public class MobilePhone extends Phone{

    private Melod melody ;

    public MobilePhone(){
        setName("huawei");
setNumber("7894412");
    }

    public MobilePhone(Melod melody) {
        this.melody = melody;
    }

    public MobilePhone(String name, String number, Melod melody) {
        super(name, number);
        this.melody = melody;
    }

    public void call(){
       // super.call();
        System.out.println("Играет мелодия  " + melody.getName() + melody.getArtist());
    }
}
