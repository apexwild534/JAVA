// The File class in Java is part of the java.io package and is used to work with files and directories on the file system. It allows you to create, delete, rename, check file properties, and perform various other file-related operations.

import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {
        // Define a file path (change this to an existing file on your system)
        String filePath = "example.txt";

        // Create a File object representing the file
        File file = new File(filePath);

        // We create a File object representing a file with a specified path (you should change this path to an existing file on your system for the code to work).

        // Check if the file exists

        // We check if the file exists and print some of its properties like name, absolute path, and size.
        if (file.exists()) {
            System.out.println("File exists.");
            System.out.println("File name: " + file.getName());
            System.out.println("File path: " + file.getAbsolutePath());
            System.out.println("File size (bytes): " + file.length());
        } else {
            System.out.println("File does not exist.");
        }

        // Create a new file

        // We create a new file using the createNewFile() method and handle any exceptions that may occur during the creation.
        try {
            File newFile = new File("newfile.txt");
            if (newFile.createNewFile()) {
                System.out.println("New file created: " + newFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.err.println("An error occurred while creating the file: " + e.getMessage());
        }

        // Delete a file

        // We attempt to delete a file using the delete() method and provide feedback on whether the deletion was successful.
        
        File fileToDelete = new File("fileToDelete.txt");
        if (fileToDelete.exists()) {
            if (fileToDelete.delete()) {
                System.out.println("File deleted: " + fileToDelete.getName());
            } else {
                System.out.println("Failed to delete the file.");
            }
        } else {
            System.out.println("File to delete does not exist.");
        }
    }
}
