package lesson22;

public class DemoProduct {
    public static void main(String[] args) {
        Product iphone = new Product("Iphone", "Phone", 1100);
        Product car = new Product("BMW", "Car", 3000);
        Product iphone1 = new Product("Iphone", "Phone", 1100);
        Product iphone2 = iphone;
        Product iphone3 = null;
        System.out.println(iphone.getClass());
        System.out.println(iphone.equals(car));
        System.out.println(iphone.equals(iphone1));
        System.out.println(iphone.equals(iphone2));
      //  System.out.println(iphone.equals(iphone3));
        System.out.println(iphone.equals("abc"));
     //   System.out.println(iphone3.equals(iphone3));

    }
}
