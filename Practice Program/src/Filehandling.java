import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Filehandling  {
    public static void main(String[] args) {
        //file hadling works on file :- create, write, read, update, delete, Search and access.
        System.out.println("Enter The File Name:- ");
        Scanner scanner = new Scanner(System.in);
        String filename = scanner.nextLine();
        //1.To create the file :- filename and extension
        File file = new File(filename+".txt");
        //To check the file i already created or not
        try {
            if (file.createNewFile()) {
                System.out.println("File is created");
            } else {
                System.out.println("File already Exists");
            }
            if (file.exists()) {
                //Write The Data in Your File
                FileWriter writer = new FileWriter(filename + ".txt",true);
                System.out.println("Write the message in you file");
                String message = scanner.nextLine();
                //to write message in your file
                writer.write(message);
                writer.close();
            } else {
                System.out.println("File not found");
            }
            //read file using scanner
            Scanner filereader = new Scanner(file);
            String data ="";
            while (filereader.hasNextLine()) {
                data= scanner.nextLine();
                data= filereader.nextLine();
        }
            System.out.println(data);
        filereader.close();
        //Update Message In The File
            System.out.println(data);
            System.out.println("Enter ur updated data");
            String update = scanner.nextLine();
            FileWriter updatewriter = new FileWriter(file,true);
            updatewriter.append(update+ "");
            updatewriter.close();
            // Find The Existing Message In this Code
            System.out.println("Enter The Message To Find In File");
            String search = scanner.nextLine();
            if (data.contains(search))
            {
                System.out.println("Found");
            }
            else {
                System.out.println("Not found");
            }
        }

        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
