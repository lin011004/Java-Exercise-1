// Abstraction Example in Java
abstract class Vehicle {
    abstract void start(); // abstract method (no implementation)
    
    void fuelType() {
        System.out.println("Uses petrol or diesel.");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car starts with a key.");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike starts with a self-start button.");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();
        
        v1.start();
        v2.start();
        v1.fuelType();
    }
}
