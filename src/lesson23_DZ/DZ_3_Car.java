package lesson23_DZ;

public class DZ_3_Car {
    private String Name;
    private int power;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public DZ_3_Car(String name, int power) {
        Name = name;
        this.power = power;
    }

    @Override
    public String toString() {
        return "DZ_3_Car{" +
                "Name='" + Name + '\'' +
                ", power=" + power +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DZ_3_Car dz_3_car = (DZ_3_Car) o;

        if (power != dz_3_car.power) return false;
        return Name != null ? Name.equals(dz_3_car.Name) : dz_3_car.Name == null;
    }

    @Override
    public int hashCode() {
        int result = Name != null ? Name.hashCode() : 0;
        result = 31 * result + power;
        return result;
    }
}
//На склад поступили автомобили.
// Каждый автомобиль имеет марку и мощность двигателя.
// Нужно вывести на экран номенклатуру автомобилей на складе
// (какие разные автомобили есть на складе).