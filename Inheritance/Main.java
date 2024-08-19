// Base class
class Vehicle {
    String brand;
    
    void honk() {
        System.out.println("The vehicle is honking.");
    }
}

// Derived class
class Car extends Vehicle {
    String model;
    
    void startEngine() {
        System.out.println("The car engine is starting.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.brand = "Toyota";
        myCar.model = "Corolla";
        
        myCar.honk(); // Inherited method
        myCar.startEngine(); // Own method
    }
}

