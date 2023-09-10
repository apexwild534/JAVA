import java.util.Scanner;

public class SimpleInputOutputExample {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // We use the Scanner class from the java.util package to read input from the user.

        // Prompt the user for input
        System.out.print("Enter an integer: ");

        // Read an integer from the user
        int userInput = scanner.nextInt();

        // Process the input (e.g., double the input)
        int doubledValue = userInput * 2;

        // Display the result
        System.out.println("You entered: " + userInput);
        System.out.println("Doubled value: " + doubledValue);

        // Close the scanner
        scanner.close();
    }
}
