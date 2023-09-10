import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReaderExample {
    public static void main(String[] args) {
        // Specify the file path to read from
        String filePath = "example3.txt"; // Change this to the path of an existing text file

        // Declare a FileReader and BufferedReader
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            // Create a FileReader for the specified file
            fileReader = new FileReader(filePath);

            // Wrap the FileReader with a BufferedReader for efficient reading
            bufferedReader = new BufferedReader(fileReader);

            // Read and display the content line by line
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        } finally {
            try {
                // Close the BufferedReader and FileReader in a finally block
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                System.err.println("An error occurred while closing the file: " + e.getMessage());
            }
        }
    }
}
