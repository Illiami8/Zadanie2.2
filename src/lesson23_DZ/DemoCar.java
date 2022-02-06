package lesson23_DZ;

import lesson23_DZ.DZ_3_Car;

import java.util.HashSet;
import java.util.Set;

public class DemoCar {
    public static void main(String[] args) {
        DZ_3_Car bmw = new DZ_3_Car("BMW", 180);
        DZ_3_Car mers = new DZ_3_Car("Mers", 140);
        DZ_3_Car opel = new DZ_3_Car("Opel", 140);
        DZ_3_Car kia = new DZ_3_Car("Kia", 130);
        DZ_3_Car lada = new DZ_3_Car("Lada", 60);
        DZ_3_Car ladaVesta = new DZ_3_Car("Lada", 60);


        Set<DZ_3_Car> car = new HashSet<>();
        car.add(bmw);
        car.add(mers);
        car.add(opel);
        car.add(kia);
        car.add(lada);
        car.add(ladaVesta);

        printName(car);
        print(car);
    }

    private static void print(Set<DZ_3_Car> cars) {
        for (DZ_3_Car carr : cars) {
            System.out.println(carr);
        }
    }
    private static void printName(Set<DZ_3_Car> cars){
        for (DZ_3_Car carr : cars){
            System.out.println(carr.getName());
        }
    }

}
