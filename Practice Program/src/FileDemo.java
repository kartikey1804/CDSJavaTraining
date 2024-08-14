import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo {
    public static void main(String[] args) {
        // File handling works on file: create, write, read, update, delete, search, and access.
        System.out.println("Enter The File Name:- ");
        Scanner scanner = new Scanner(System.in);
        String filename = scanner.nextLine();

        // 1. To create the file: filename and extension
        File file = new File(filename + ".txt");

        // To check if the file is already created or not
        try {
            if (file.createNewFile()) {
                System.out.println("File is created");
            } else {
                System.out.println("File already Exists");
            }
            if (file.exists()) {
                // Write the data in your file
                FileWriter writer = new FileWriter(filename + ".txt", true); // Set append mode to true
                System.out.println("Write the message in your file");
                String message = scanner.nextLine();
                // To write the message in your file
                writer.write(message + System.lineSeparator());
                writer.close();
            } else {
                System.out.println("File not found");
            }

            // Read file using scanner
            Scanner filereader = new Scanner(file);
            String data = "";
            System.out.println("Current content of the file:");
            while (filereader.hasNextLine()) {
                data = filereader.nextLine();
                System.out.println(data);
            }
            filereader.close();

            // Ask user if they want to update the file
            System.out.println("Do you want to update the file? (yes/no)");
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("yes")) {
                System.out.println("Write the message to append to the file");
                String updateMessage = scanner.nextLine();
                // Append the update message to the file
                FileWriter writer = new FileWriter(filename + ".txt", true);
                writer.write(updateMessage + System.lineSeparator());
                writer.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            scanner.close();
        }
    }
}