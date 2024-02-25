import java.util.Scanner;

public class GreatestNumberFinder {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.println("Enter the first number (a): ");
        double a = scanner.nextDouble();

        // Prompt the user to enter the second number
        System.out.println("Enter the second number (b): ");
        double b = scanner.nextDouble();

        // Determine and print the greatest number
        if (a > b) {
            System.out.println(a + " is greater than " + b + ".");
        } else if (b > a) {
            System.out.println(b + " is greater than " + a + ".");
        } else {
            System.out.println("Both numbers are equal.");
        }
        
        // Close the scanner
        scanner.close();
    }
}
