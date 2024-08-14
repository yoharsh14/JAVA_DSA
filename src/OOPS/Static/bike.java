package OOPS.Static;


public class bike {
    public static void main(String[] args) {
        Car car = new Car("bc");
        Car.Test sr = new Car.Test("ad");
//        car.print();
        System.out.println(sr.getName());
    }
}
