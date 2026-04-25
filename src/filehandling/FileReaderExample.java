package filehandling;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        // File name to read
        String filename = "Rishabh.txt";

        // Use try-with-resources to automatically close the reader
        try (FileReader reader = new FileReader(filename)) {
            int character;

            System.out.println(" Reading data from the file:\n");

            // Read the file character by character until the end (-1)
            while ((character = reader.read()) != -1) {
                System.out.print((char) character); // Print each character
            }

            System.out.println("\n\n Successfully read the file!");
        }
        catch (IOException e) {
            System.out.println(" An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
