import java.util.Scanner;

public class Methodoverloading {
    public static void main(String[] args) {
        System.out.println("Enter Your today earning and Expense");
        Scanner scanner = new Scanner(System.in);
        int earning = scanner.nextInt();
        int expense = scanner.nextInt();
        int saving = todaySaving(earning,expense);
        System.out.println("Saving is "+saving);
    }

    private static int todaySaving(int earning, int expense) {
        return (earning-expense);
    }
}