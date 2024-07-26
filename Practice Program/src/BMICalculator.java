import java.util.Scanner;
// Simple BMI Calculator-- @Kartikey Pandey
public class BMICalculator {
    public static void main(String[] args) {
        //Scanner class We use Take Input from User.
        Scanner input = new Scanner(System.in);
        // Enter Your Weight in Kilogram
        System.out.println("Enter Your Weight:");
        //We are using double as it has More Specific floating point values.
        double weight = input.nextDouble();
        // Enter Your height in Metre
        System.out.println("Enter Your Height:");
        double height = input.nextDouble();
        //Here we are using the simple Bmi Calculation Formula To known the BMI.
        double bmi =weight/(height* height);
        //After Calculation Print statement ----@Kartikey Pandey
        System.out.println("Your BMI is :"+bmi);
    }
}


