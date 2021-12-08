package lesson12.DZ;

public class Train {
    private int numberTrain;
    private VagonTrain train1;
    private VagonTrain train2;

    Train() {

    }

    Train(int numberTrain, VagonTrain train1, VagonTrain train2) {
        this.numberTrain = numberTrain;
        this.train1 = train1;
        this.train2 = train2;
    }

    public int getNumberTrain() {
        return numberTrain;
    }

    public void setNumberTrain(int numberTrain) {
        this.numberTrain = numberTrain;
    }

    public VagonTrain getTrain1() {
        return train1;
    }

    public void setTrain1(VagonTrain train1) {
        this.train1 = train1;
    }

    public VagonTrain getTrain2() {
        return train2;
    }

    public void setTrain2(VagonTrain train2) {
        this.train2 = train2;
    }

    public int sum(){
        return getTrain1().getArray().getPlace();
    }
    @Override
    public String toString() {
        return "Поезд Номер " + numberTrain +
                " train1" + train1 +
                ", train2" + train2  ;
    }
}
