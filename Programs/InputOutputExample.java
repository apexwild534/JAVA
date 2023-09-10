import java.util.Scanner;

// Define an interface IOHandler
interface IOHandler {
    void readInput();
    void writeOutput();
}

// We define an interface IOHandler with two abstract methods: readInput() and writeOutput(). This represents a generic input and output operation.

// Define a class DataProcessor that implements the IOHandler interface
class DataProcessor implements IOHandler {
    private int inputData;
    private int outputData;

    // We have a class DataProcessor that implements the IOHandler interface. It provides its own implementations for readInput() and writeOutput(). In the readInput() method, it reads an integer from the console, and in the writeOutput() method, it displays the processed data.

    @Override
    public void readInput() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            inputData = scanner.nextInt();
        }
    }

    @Override
    public void writeOutput() {
        System.out.println("Output: " + outputData);
    }

    public void processData() {
        outputData = inputData * 2; // Process the input data

        // The processData() method in the DataProcessor class simulates processing the input data by doubling it.
    }
}

public class InputOutputExample {
    public static void main(String[] args) {
        // Create an instance of DataProcessor

        // In the main method, we create an instance of DataProcessor. We call readInput() /to read an integer, then call processData() to process the input, and finally, call writeOutput() to display the output.

        IOHandler dataProcessor = new DataProcessor();

        // Read input
        dataProcessor.readInput();

        // Process the input
        if (dataProcessor instanceof DataProcessor) {
            ((DataProcessor) dataProcessor).processData();
        }

        // Write the output
        dataProcessor.writeOutput();
    }
}
