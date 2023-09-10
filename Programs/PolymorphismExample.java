// Define an interface Performable
interface Performable {
    void performAction();
}

// We define an interface Performable with one abstract method performAction(), representing a generic action.

// Define a class Performer that implements the Performable interface
class Performer implements Performable {
    private String action;

    public Performer(String action) {
        this.action = action;
    }

    // We have a class Performer that implements the Performable interface. It provides its own implementation for the performAction() method without specifying any specific actions.

    @Override
    public void performAction() {
        System.out.println("Performing action: " + action);
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        // Create instances of Performer

        // In the main method, we create instances of Performer and call the performAction() method on these instances.

        Performable performer1 = new Performer("Action 1");
        Performable performer2 = new Performer("Action 2");

        // Call the performAction method on both instances
        performer1.performAction();
        performer2.performAction();

        // Demonstrating polymorphism by using an array of Performable
        Performable[] performers = new Performable[2];
        performers[0] = new Performer("Action 3");
        performers[1] = new Performer("Action 4");

        // Call the performAction method on the array elements
        for (Performable performer : performers) {
            performer.performAction();
        }
    }
}


// We demonstrate polymorphism by creating an array of Performable objects and populating it with instances of the Performer class. We then iterate through the array and call the performAction() method on each element, showing how polymorphism allows us to use different objects interchangeably based on their common interface.