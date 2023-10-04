package Lab3;

public class CarTester {
    public static void main(String[] args) {
        Car mercedes = new Car("mercedes","AMG GT",20000,"Black",false);
        mercedes.setMileage(mercedes.getMileage() + 15000);
        mercedes.setInsured(true);
        System.out.println(mercedes.toString());



    }

}
