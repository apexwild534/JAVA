import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample {
    public static void main(String[] args) {
        // Create an InputStream for reading from the console (System.in)
        InputStream inputStream = System.in;

        // We use System.in to create an InputStream for reading input from the console

        System.out.print("Enter your name: ");

        try {
            // Create a byte array to store the input
            byte[] inputBytes = new byte[100];
            
            // Read the input from the user
            int bytesRead = inputStream.read(inputBytes);

            // We use inputStream.read(inputBytes) to read input from the user into the inputBytes array. It reads characters until the user presses Enter, and the number of bytes read is stored in bytesRead

            // Convert the byte array to a string
            String name = new String(inputBytes, 0, bytesRead - 1);

            // We convert the byte array to a string and remove the trailing newline character to get the user's name.

            // Display the user's name
            System.out.println("Hello, " + name + "!");
        } catch (IOException e) {
            System.err.println("An error occurred while reading input: " + e.getMessage());
        }
    }
}
