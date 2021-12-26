package lesson17_DZ;

public class Rectangle extends Figure {
 protected double length1;
 protected double width;
protected double ploschRect;
    public Rectangle(String name, double length, double width) {
        super(name);
        this.length1 = length;
        this.width = width;
    }

    public double getPlocs(){
        return ploschRect = length1 * width;
    }
    }

