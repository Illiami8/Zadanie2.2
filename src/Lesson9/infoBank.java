package Lesson9;

public class infoBank {
    int pan ;
    int pin;
    int summaMoney;
    infoBank(int pan, int pin, int summaMoney){
        this.pan=pan;
        this.pin=pin;
        this.summaMoney=summaMoney;
    }
    public int getAmount(int summa){
        int sum = summaMoney;
        return summaMoney;
    }
    public int withDraw(int minus){
        int min = summaMoney - minus;
        return min;
    }
    public int deposit(int plus){
        int pl = summaMoney + plus;
        return pl;
    }
}
//	В классе сделать методы
//getAmount, возвращающий остаток денег на карте
//withdraw, списывающий деньги с карты и возаращий остаток.
//deposit, добавляющий деньги на карту и возвращающий остаток.