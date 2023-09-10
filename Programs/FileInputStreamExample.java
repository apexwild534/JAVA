// The FileInputStream class in Java is used for reading binary data from files. It's part of the java.io package and is commonly used when you need to read files that contain non-text data, such as images, audio, or other binary data.


import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) {
        // Specify the file path to read from
        String filePath = "example.txt"; // Change this to the path of an existing file

        // We specify the file path (filePath) to read from. Be sure to change this to the path of an existing file on your system.

        // Declare a FileInputStream
        FileInputStream inputStream = null;

        // We declare a FileInputStream named inputStream.

        try {

            // Inside a try block, we create a FileInputStream for the specified file path.
            // Create a FileInputStream for the specified file
            inputStream = new FileInputStream(filePath);

            // Read and display the content byte by byte
            int byteData;
            while ((byteData = inputStream.read()) != -1) {
                System.out.print((char) byteData);
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        } finally {

            // We close the FileInputStream in a finally block to ensure that the stream is closed even if an exception occurs.
            try {
                // Close the FileInputStream in a finally block
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                System.err.println("An error occurred while closing the file: " + e.getMessage());
            }
        }
    }
}
