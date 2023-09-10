// Define an abstract class Shape
abstract class Shape {
    // Abstract method to calculate area
    public abstract double calculateArea();

    // Concrete method to display a message
    public void display() {
        System.out.println("This is a shape.");
    }

    // We have an abstract class Shape with an abstract method calculateArea() that must be implemented by its derived classes. It also has a concrete method display().

}

// Derived class Circle extending Shape
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Two classes, Circle and Rectangle, extend the Shape class and provide their own implementations of the calculateArea() method.

// Derived class Rectangle extending Shape
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        // Create instances of Circle and Rectangle

        // In the main method, we create instances of both Circle and Rectangle, call the display() method from the base class, and calculate and display the areas using the overridden calculateArea() methods.

        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        // Call abstract and concrete methods
        circle.display();
        System.out.println("Circle Area: " + circle.calculateArea());

        rectangle.display();
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
    }
}
