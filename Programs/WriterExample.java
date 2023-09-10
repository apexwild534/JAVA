import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriterExample {
    public static void main(String[] args) {
        // Specify the file path to write to
        String filePath = "output3.txt";

        // Declare a FileWriter and BufferedWriter
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            // Create a FileWriter for the specified file
            fileWriter = new FileWriter(filePath);

            // Wrap the FileWriter with a BufferedWriter for efficient writing
            bufferedWriter = new BufferedWriter(fileWriter);

            // Write text to the file
            String textToWrite = "Hello, JAVA Writer!";
            bufferedWriter.write(textToWrite);

            System.out.println("Data has been written to " + filePath);
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        } finally {
            try {
                // Close the BufferedWriter and FileWriter in a finally block
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                System.err.println("An error occurred while closing the file: " + e.getMessage());
            }
        }
    }
}
