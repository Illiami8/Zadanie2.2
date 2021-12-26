package lesson17_DZ;

public class Square extends Figure {
    protected double lenght;
    protected double polscha;

    public Square(String name , double lenght) {
        super(name);
        this.lenght = lenght;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getPlocs(){
        return polscha = lenght * lenght;
    }
}
