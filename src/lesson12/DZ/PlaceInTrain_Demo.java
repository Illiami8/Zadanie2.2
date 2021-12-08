package lesson12.DZ;

public class PlaceInTrain_Demo {
    public static void main(String[] args) {
        PlaceInTrain place1 = new PlaceInTrain(39, "плацкарт", " не занято ", 11);
        PlaceInTrain place2 = new PlaceInTrain(40, "плацкарт", "занято", 12);
        PlaceInTrain[] place = {place1,place2};

        System.out.println(place1);
        System.out.println(place2);

        VagonTrain vagon1 = new VagonTrain(12,place1,place2);
        VagonTrain vagon2 = new VagonTrain(12,place2,place1);
        System.out.println(vagon1);

Train train1 = new Train(2,vagon1,vagon2);
        System.out.println(train1);
        int s = train1.sum();
        System.out.println( s );
    }
}
// В демонстрационном классе в методе main создать
//// несколько таких мест и вывести их на экран так, чтобы вызывался метод toString. Помните,
//// что toString вызывается у объекта автоматически, если вы печатаете его при помощи System.out.println()