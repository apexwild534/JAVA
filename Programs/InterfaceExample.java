// Define an interface Performer
interface Performer {
    void perform();
}

// We define an interface Performer with one abstract method perform(). This represents a generic action that performers can do.

// Define a class Musician that implements the Performer interface
class Musician implements Performer {
    private String instrument;

    public Musician(String instrument) {
        this.instrument = instrument;
    }

    @Override
    public void perform() {
        System.out.println("Playing " + instrument);
    }
}

// Define a class Dancer that also implements the Performer interface
class Dancer implements Performer {
    private String style;

    public Dancer(String style) {
        this.style = style;
    }

    @Override
    public void perform() {
        System.out.println("Dancing " + style);
    }
}


// We have two classes, Musician and Dancer, both of which implement the Performer interface. They provide their own implementations for the perform() method without specifying any specific instruments or dance styles.

public class InterfaceExample {
    public static void main(String[] args) {
        // Create instances of Musician and Dancer

        // In the main method, we create instances of Musician and Dancer, call the perform() method to represent performing an action, which is playing an instrument or dancing.

        Musician musician = new Musician("piano");
        Dancer dancer = new Dancer("ballet");

        // Call interface methods on both classes
        musician.perform();
        dancer.perform();
    }
}
