package lesson17_DZ;

public class circle extends Figure {
    private double R;


    public circle(String name, double r) {
        super(name);
        R = r;
    }

    public double getR() {
        return R;
    }

    public void setR(double r) {
        R = r;
    }

    public circle(String name) {
        super(name);
    }

public double getPlocs(){
        return  3.14 * getR() * getR();
}

}
