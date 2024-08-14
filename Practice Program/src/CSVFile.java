import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CSVFile {
    public static void main(String[] args) {
        System.out.println("Enter The File Name:- ");
        Scanner scanner = new Scanner(System.in);
        String filename = scanner.nextLine();
        File file = new File(filename+".csv");
        try {
            if (file.createNewFile())
            {
                System.out.println("File Is created");
            }else {
                System.out.println("File already Exists");
            }
            FileWriter writer = new FileWriter(filename + ".csv",true);
            System.out.println("Enter Student Name");
            String message = scanner.nextLine();
            //to write message in your file
            writer.write(message);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
