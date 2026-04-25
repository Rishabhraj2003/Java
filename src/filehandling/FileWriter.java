package filehandling;

import java.io.IOException;

public class FileWriter {
    public static void main(String[] args) {
        // Define the file name (it will be created in your project folder)
        String filename = "Rishabh.txt";

        // Use try-with-resources to automatically close the FileWriter
        try (java.io.FileWriter writer = new java.io.FileWriter(filename)) {

            // Write text into the file
            writer.write("Hello Rishabh!\n");
            writer.write("Welcome to Java File Handling Example.\n");
            writer.write("This file is created using java.io.FileWriter class.");

            // Flush ensures all data is written to disk
            writer.flush();

            System.out.println(" Successfully written into the file!");
        }
        catch (IOException e) {
            System.out.println(" An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
