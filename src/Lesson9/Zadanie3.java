package Lesson9;

public class Zadanie3 {
    public static void main(String[] args) {
        infoBank card = new infoBank(23451, 544, 1600);
        infoBank card1 = new infoBank(21131, 566, 2000);
        infoBank card2 = new infoBank(12345, 520, 1000);
        System.out.println("Сумма денег " + card.summaMoney);
        System.out.println("Pin " + card.pin);
        System.out.println("pan" + card.pan);

        System.out.println("Сумма денег " + card1.summaMoney);
        System.out.println("Pin " + card1.pin);
        System.out.println("pan" + card1.pan);

        System.out.println("Сумма денег " + card2.summaMoney);
        System.out.println("Pin " + card2.pin);
        System.out.println("pan " + card2.pan);
    }
}
//Создать класс, позволяющий хранить информацию о банковской карте со следующими полями:
//pan -- номер карты в виде строки. Там обычно 16 символов, до давайте сделаем 5.
//pin -- номер карты в виде строки 3 символа.
//Сумма денег на карте
//	В классе сделать методы
//getAmount, возвращающий остаток денег на карте
//withdraw, списывающий деньги с карты и возаращий остаток.
//deposit, добавляющий деньги на карту и возвращающий остаток.
//В основном классе создать список из 3-х карт в коде.
// Вывести на экран список содержимое всех этих карт: pan, pin, остаток
//Далее в основном классе написать два метода:
// depositMoney(Card[] cards, String pan, String pin, int amount) и
// withdrawMoney(Cards[] cards, String pan, String pin, int amount).
// Методы должен бежать по списку, проверять на совпадения pan и pin
// (не забывайте про то, что строки сравнивать нужно методом equals().
// Если находит карту, то добавлять или уменьшать деньги на карте. Если не находит, то ничего не делать.
//В методе main ввести с клавиатуры pin, pan, и сумму вносимых денег.
// Вызвать метод depositMoney. Потом вывести список карт ещё раз.
//Потом ещё раз ввести с клавиатуры pin, pan и сумму снимаемых денег. Вызвать метод withdrawMoney.
// И ещё раз вывести список карт.