package lesson12.DZ;

public class PlaceInTrain {
    private int mesto;
    private String tape;
    private String busyness;
    private int prace;

    public PlaceInTrain() {

    }

    public PlaceInTrain(int mesto, String tape, String busyness, int prace) {
        this.mesto = mesto;
        this.tape = tape;
        this.busyness = busyness;
        this.prace = prace;
    }

    public int getPlace() {
        return mesto;
    }

    public void setPlace(int mesto) {
        this.mesto = mesto;
    }

    public String getTape() {
        return tape;
    }

    public void setTape(String tape) {
        this.tape = tape;
    }

    public String getBusyness() {
        return busyness;
    }

    public void setBusyness(String busyness) {
        this.busyness = busyness;
    }

 public int getPrace(){
        return prace;
 }

    public void setMesto(int mesto) {
        this.mesto = mesto;
    }

    public int sum(int prace){
        int sum = 0 ;
        sum = sum + getPrace();
        return sum;
    }

    @Override
    public String toString() {
        return "PlaceInTrain{" +
                "mesto=" + mesto +
                ", tape='" + tape + '\'' +
                ", busyness='" + busyness + '\'' +
                ", prace=" + prace +
                '}';
    }
}
//Для всех задач классы должны быть созданы по следующей схеме:
//класс должен быть public
//поля должны быть private
//конструктор без параметров должен быть public
//конструктор со всеми параметрами должен быть public
//на каждое поле должны быть public методы доступа
//геттер
//сеттер
//должен быть определен метод public String toString()
//
//Создать класс, описывающий место в пассажирском вагоне поезда:
// в классе должны быть поля для номера места, типа места (сидячее, плацкарт, купе),
// занятости места (занято, не занято) и его цены. В демонстрационном классе в методе main создать
// несколько таких мест и вывести их на экран так, чтобы вызывался метод toString. Помните,
// что toString вызывается у объекта автоматически, если вы печатаете его при помощи System.out.println()
//Создать класс, описывающий вагон поезда: номер вагона и массив мест на основе класса, созданного в первой задаче.
// Проверьте под debug-ом, что метод toString вагона вызывает toString-методы мест. Создайте в main методе демонстрационного
// класса 2 вагона, каждый из которых содержит по 4 места, выведите их на печать так, чтобы выводились и места в этих вагонах.
// Выведите эти 2 вагона на экран.
//Создать класс, описывающий поезд. Поезд содержит номер поезда и массив вагонов.
// Проверьте под debug-ом, что toString методы поезда вызывают toString методы вагонов,
// а те, в свою очередь вызывают toString-методы мест. В демонстрационном классе в методе main создайте поезд с 2-мя
// вагонами и выведите его на печать.
//В демонстрационном классе задачи 3 создайте метод, возвращающий, сколько денег принесут занятые места в поезде.
// Подумайте, может стоит добавить какой-то метод, упрощающий эту задачу, в класс вагона.