import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamExample {
    public static void main(String[] args) {
        // Specify the file name to write to
        String fileName = "output3.txt";

        // We specify the name of the file (output.txt) that we want to write to.

        // We use a try-with-resources block to create an OutputStream (in this case, a FileOutputStream) for writing to the specified file.

        try (OutputStream outputStream = new FileOutputStream(fileName)) {
            // Text to write to the file
            String text = "Hello, OutputStream!";

            // Convert the text to bytes
            byte[] bytes = text.getBytes();

            // We convert the text to bytes using the getBytes() method.

            // Write the bytes to the output stream
            outputStream.write(bytes);

            // We use the write() method of the OutputStream to write the bytes to the file.

            System.out.println("Data has been written to " + fileName);
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());

            // If an exception occurs during the file writing process (such as IOException), we catch it and print an error message to the standard error stream (System.err).
        }
    }
}