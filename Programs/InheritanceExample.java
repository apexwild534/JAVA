// Define the base class Vehicle
class Vehicle {
    // Fields
    String brand;
    int year;

    // Constructor
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // We define a base class Vehicle with fields for brand and year, a constructor, and a method to display information about the vehicle.

    // Method to display vehicle information
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}

// Define the derived class Car, inheriting from Vehicle
class Car extends Vehicle {
    // Additional field specific to Car
    int numOfDoors;

    // Constructor for Car
    public Car(String brand, int year, int numOfDoors) {
        // Call the constructor of the base class (Vehicle)
        super(brand, year);
        this.numOfDoors = numOfDoors;
    }

    // We define a derived class Car that inherits from Vehicle. It has an additional field for the number of doors, a constructor that calls the base class constructor using super(), and a method to display car-specific information.

    // Method to display car information, including base class information
    public void displayCarInfo() {
        System.out.println("Car Information:");
        displayInfo(); // Call the base class method
        System.out.println("Number of Doors: " + numOfDoors);
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        // Create a Car object

        // In the main method, we create an instance of the Car class and call its displayCarInfo method, which also invokes the displayInfo method from the base class.

        Car myCar = new Car("Toyota", 2022, 4);

        // Call methods to display information
        myCar.displayCarInfo();
    }
}
