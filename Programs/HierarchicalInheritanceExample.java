// Define the base class Animal
class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    // We have a base class Animal with fields for the name of the animal and methods eat() and sleep().

}

// Define a derived class Dog
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println(name + " is barking.");
    }

    // The derived class Dog extends Animal and adds a method bark().

}

// Define another derived class Cat
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public void meow() {
        System.out.println(name + " is meowing.");
    }

    // Another derived class Cat also extends Animal and adds a method meow()

}

public class HierarchicalInheritanceExample {
    public static void main(String[] args) {
        // Create instances of Dog and Cat

        // In the main method, we create instances of Dog and Cat and call methods specific to each class.

        Dog myDog = new Dog("Max");
        Cat myCat = new Cat("Whiskers");

        // Call methods specific to each class
        myDog.bark();
        myDog.eat();
        myDog.sleep();

        myCat.meow();
        myCat.eat();
        myCat.sleep();
    }
}
