package lesson12.DZ;

public class VagonTrain {
    private int numberVagon;
    private PlaceInTrain arrayMest;
    private PlaceInTrain array;

    VagonTrain() {

    }

    VagonTrain(int numberVagon, PlaceInTrain arrayMest, PlaceInTrain arrray) {
        this.numberVagon = numberVagon;
        this.arrayMest = arrayMest;
        this.array = arrray;
    }

    public int getNumberVagon() {
        return numberVagon;
    }

    public void setNumberVagon(int numberVagon) {
        this.numberVagon = numberVagon;
    }

    public PlaceInTrain getArrayMest() {
        return arrayMest;
    }

    public void setArrayMest(PlaceInTrain arrayMest) {
        this.arrayMest = arrayMest;
    }

    public PlaceInTrain getArray() {
        return array;
    }

    public void setArray(PlaceInTrain array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "VagonTrain{" +
                "numberVagon=" + numberVagon +
                ", arrayMest=" + arrayMest +
                ", array=" + array +
                '}';
    }
}
//Создать класс, описывающий вагон поезда: номер вагона и массив мест на основе класса, созданного в первой задаче.
//// Проверьте под debug-ом, что метод toString вагона вызывает toString-методы мест. Создайте в main методе демонстрационного
//// класса 2 вагона, каждый из которых содержит по 4 места, выведите их на печать так, чтобы выводились и места в этих вагонах.
//// Выведите эти 2 вагона на экран.