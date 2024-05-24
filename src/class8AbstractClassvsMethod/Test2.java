package class8AbstractClassvsMethod;
abstract class Vehicle {
//    public abstract int getNoOfWheels ();
}

class Bus extends Vehicle {
//    @Override
    public int getNoOfWheels() {
        return 6;
    }
}

class Car extends Vehicle {

//    @Override
    public int getNoOfWheels() {
        return 4;
    }
}

public class Test2 {
    public static void main(String[] args) {
        Bus b = new Bus();
        System.out.println(b.getNoOfWheels());

        Car c = new Car();
        System.out.println(c.getNoOfWheels());
    }
}
