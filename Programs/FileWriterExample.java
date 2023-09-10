import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        // Specify the file path to write to
        String filePath = "output2.txt";

        // Declare a FileWriter
        FileWriter fileWriter = null;

        try {
            // Create a FileWriter for the specified file (append mode is false by default)
            fileWriter = new FileWriter(filePath);

            // Write text to the file
            String textToWrite = "Hello, Java Pearson!";
            fileWriter.write(textToWrite);

            System.out.println("Data has been written to " + filePath);
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        } finally {
            try {
                // Close the FileWriter in a finally block
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                System.err.println("An error occurred while closing the file: " + e.getMessage());
            }
        }
    }
}
