import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.println("enter Your Marks: ");
        Scanner scanner= new Scanner(System.in);
        int marks= scanner.nextInt();

        switch (marks){
            case 10:
                System.out.println("FAIL");
                break;
            case 50:
                System.out.println("Pass D");
                break;
            case 80:
                System.out.println("Pass B");
                break;
            case 90:
                System.out.println("Pass A");
                break;
            default:
                System.out.println("Marks not match");
                 }
           }
}