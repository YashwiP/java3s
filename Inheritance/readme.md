Example:

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



Let's break down the provided Java code step by step to understand the concept of Inheritance.

1. Base Class Definition

    class Vehicle {
        String brand;
        
        void honk() {
            System.out.println("The vehicle is honking.");
        }
    }


Explanation:

Class Declaration (class Vehicle): This line defines a new class named Vehicle. This is the base class (also called the superclass or parent class) that provides common attributes and methods for derived classes.

Attribute:
    String brand;: This declares a variable brand of type String that will hold the brand of the vehicle.

Method:
    void honk() { ... }: This method is used to simulate the honking sound of a vehicle. When called, it prints "The vehicle is honking." to the console.


2. Derived Class Definition

    class Car extends Vehicle {
        String model;
        
        void startEngine() {
            System.out.println("The car engine is starting.");
        }
    }

Explanation:

Class Declaration (class Car extends Vehicle): This line defines a new class named Car that inherits from the Vehicle class. The keyword extends indicates that Car is a derived class (also known as a subclass or child class) of Vehicle.

Inheritance:
    By using the extends keyword, the Car class inherits all the attributes and methods of the Vehicle class. This means that Car can use the brand attribute and the honk() method defined in Vehicle without having to redefine them.

New Attribute:
    String model;: This declares a variable model of type String that will hold the model of the car. This attribute is specific to the Car class and is not part of the Vehicle class.

New Method:
    void startEngine() { ... }: This method is used to simulate starting the car's engine. When called, it prints "The car engine is starting." to the console. This method is specific to the Car class and is not part of the Vehicle class.


3. Main Class and Method

    public class Main {
        public static void main(String[] args) {
            Car myCar = new Car();
            myCar.brand = "Toyota";
            myCar.model = "Corolla";
            
            myCar.honk(); // Inherited method
            myCar.startEngine(); // Own method
        }
    }


Explanation:
    Class Declaration (public class Main): This line defines a new class named Main. The public keyword indicates that this class is accessible from outside its package.

    main Method:
        public static void main(String[] args) { ... }: This is the entry point of the Java program.


4. Creating and Using a Car Object

Object Creation:
    Car myCar = new Car();

    This line creates a new instance of the Car class. Car() is the constructor of the class Car that initializes the object. myCar is a reference variable that holds the memory address of the created object.

    Setting Attributes:
        myCar.brand = "Toyota";
        myCar.model = "Corolla";

    These lines assign values to the brand and model attributes of the myCar object. The brand attribute is inherited from the Vehicle class, and the model attribute is specific to the Car class.


    Calling Methods:

        myCar.honk(); // Inherited method
        myCar.startEngine(); // Own method


    myCar.honk();: This line calls the honk() method, which is inherited from the Vehicle class. It prints "The vehicle is honking." to the console.
    myCar.startEngine();: This line calls the startEngine() method, which is specific to the Car class. It prints "The car engine is starting." to the console.


5. Complete Flow of Execution

    1.  The program starts executing from the main method in the Main class.
    2.  A new Car object (myCar) is created.
    3.  The brand attribute (inherited from Vehicle) and the model attribute (specific to Car) of the myCar object are set.
    4.  The honk() method (inherited from Vehicle) and the startEngine() method (specific to Car) are called.
    5.  The respective messages are printed to the console.

Summary

This code demonstrates the concept of Inheritance in Java. Inheritance allows a class (the derived class) to acquire the properties and behaviors (attributes and methods) of another class (the base class). Here, the Car class inherits from the Vehicle class, gaining access to its brand attribute and honk() method. Additionally, the Car class defines its own attribute (model) and method (startEngine()).

Benefits of Inheritance:
-   Reusability: Code defined in the base class can be reused in the derived class.
-   Extensibility: The derived class can add its own unique attributes and methods, extending the functionality of the base class.
-   Maintainability: Common code can be centralized in the base class, making it easier to maintain and update.
-   Polymorphism: Inheritance enables polymorphism, where a subclass can override or implement methods in its own way while still being referred to by the base class type.