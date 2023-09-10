import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
    public static void main(String[] args) {
        // Specify the file path to write to
        String filePath = "output.txt";

        // We specify the file path (filePath) to write to.

        // Declare a FileOutputStream
        FileOutputStream outputStream = null;

        try {

            // Inside a try block, we create a FileOutputStream for the specified file path.
            // Create a FileOutputStream for the specified file
            outputStream = new FileOutputStream(filePath);

            // Write data to the file
            String dataToWrite = "Hello, Java Learner!";
            byte[] dataBytes = dataToWrite.getBytes();
            outputStream.write(dataBytes);

            // We write data to the file using the write() method. In this case, we convert a string to bytes using getBytes() and then write those bytes to the file.

            System.out.println("Data has been written to " + filePath);
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        } finally {

            // We close the FileOutputStream in a finally block to ensure that the stream is closed even if an exception occurs.
            try {
                // Close the FileOutputStream in a finally block
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch (IOException e) {
                System.err.println("An error occurred while closing the file: " + e.getMessage());
            }
        }
    }
}
