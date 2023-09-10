import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        // Specify the file path to read from
        String filePath = "example2.txt"; // Change this to the path of an existing text file

        // Declare a FileReader
        FileReader fileReader = null;

        try {
            // Create a FileReader for the specified file
            fileReader = new FileReader(filePath);

            // Read and display the content character by character
            int charData;
            while ((charData = fileReader.read()) != -1) {
                System.out.print((char) charData);
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        } finally {
            try {
                // Close the FileReader in a finally block
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                System.err.println("An error occurred while closing the file: " + e.getMessage());
            }
        }
    }
}
