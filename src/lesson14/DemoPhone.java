package lesson14;

public class DemoPhone {
    public static void main(String[] args) {
        Melod melod1 = new Melod("Кукушка ", "Гагарина");
        Melod melod2 = new Melod("Солнце золотое ", "LSP");

        Phone phone[] = new Phone[2];
        phone[0] = new MobilePhone("Huawei", "33 4561237", melod1);
        phone[1] = new HomePhone("ZTE", "34441", "Динь-динь");
        for (int i = 0; i < phone.length; i++) {
            phone[i].call();
        }

    }
}
//В демонстрационном классе создать объекты на основе классов Melody,
// MobilePhone и HomePhone, где в строку звонка поместить “Динь-динь”.
// Добавить Melody в MobilePhone. Создать массив на основе типа Phone и положить туда MobileHome и HomePhone.
// Пробежаться по массиву циклом и вызывать у телефонов методы call.