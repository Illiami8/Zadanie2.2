package lesson14;

public class Phone {

    private String name;
    private String number;

    public Phone(){

    }

    public Phone(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void info(){
        System.out.println("name "+ name + "number " + number);
    }

    public void call(){
        System.out.println();
    }
}
//Создать класс Phone с полями name и number  и метод call()
// Создать два его наследника: MobilePhone и HomePhone.
// У MobilePhone сделать поле типа Melody melody-- для этого сделать ещё один класс
// Melody с названием композиции и артиста (примерно, как в задании про Player).
// У HomePhone просто строковое поле String buzzer -- звонок. В классах MobilePhone и
// HomePhone переопределить дметод call() так, чтобы MobilePhone печатал “Играет мелодия “
// и дальше выводил объект melody, а HomePhone выводил “Звенит звонок” и дальше выводил содержимое поля buzzer
//В демонстрационном классе создать объекты на основе классов Melody,
// MobilePhone и HomePhone, где в строку звонка поместить “Динь-динь”.
// Добавить Melody в MobilePhone. Создать массив на основе типа Phone и положить туда MobileHome и HomePhone.
// Пробежаться по массиву циклом и вызывать у телефонов методы call.