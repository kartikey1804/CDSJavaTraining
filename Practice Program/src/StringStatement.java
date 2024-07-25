import java.util.Scanner;

//String formatting
public class StringStatement {
    public static void main(String[] args) {
        String name = "Kartikey Pandey";
        System.out.println(name);
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        Scanner scanner = new Scanner(System.in);
        String sname = scanner.nextLine();
        if (sname.equals("Kartikey Pandey")) {

            System.out.println("allowed");
        } else {
            System.out.println("not allowed");
        }
    }
}