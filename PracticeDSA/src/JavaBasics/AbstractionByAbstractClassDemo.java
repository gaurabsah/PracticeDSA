package JavaBasics;

abstract class Vehicle{
    abstract void wheel();
    public void drive(){
        System.out.println("Driving...");
    }
}

class Bike extends Vehicle{
    @Override
    void wheel() {
        System.out.println("Two Wheel");
    }
}

class Car extends Vehicle{
    @Override
    void wheel() {
        System.out.println("Three Wheel");
    }
}

public class AbstractionByAbstractClassDemo {
    public static void main(String[] args) {
        Vehicle obj = new Car();
        obj.drive();
        obj.wheel();
    }
}
