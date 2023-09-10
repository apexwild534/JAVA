// Java does not support multiple inheritance directly for classes, which means a class cannot inherit from more than one class simultaneously. However, Java supports multiple inheritance through interfaces, which allows a class to implement multiple interfaces.


// Define the Drivable interface
interface Drivable {
    void drive();
}

// Define the Flyable interface
interface Flyable {
    void fly();
}

// We define two interfaces, Drivable and Flyable, each containing a single method.

// Create a class Vehicle that implements both interfaces
class Vehicle implements Drivable, Flyable {
    @Override
    public void drive() {
        System.out.println("Vehicle is being driven.");
    }

    @Override
    public void fly() {
        System.out.println("Vehicle is flying.");
    }
}

// The Vehicle class implements both Drivable and Flyable interfaces. It provides implementations for both drive() and fly() methods.

public class MultipleInheritanceExample {
    public static void main(String[] args) {
        // Create a Vehicle object

        // In the main method, we create a Vehicle object and call both the drive() and fly() methods to demonstrate multiple inheritance through interfaces.
        

        Vehicle myVehicle = new Vehicle();

        // Call methods from both interfaces
        myVehicle.drive();
        myVehicle.fly();
    }
}
