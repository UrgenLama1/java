import java.util.Scanner;

public class LowestNumberFinder {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.println("Enter the first number (a): ");
        double a = scanner.nextDouble();

        // Prompt the user to enter the second number
        System.out.println("Enter the second number (b): ");
        double b = scanner.nextDouble();

        // Prompt the user to enter the third number
        System.out.println("Enter the third number (c): ");
        double c = scanner.nextDouble();

        // Determine the lowest number
        double lowest = a; // Assume a is the lowest initially

        if (b < lowest) {
            lowest = b; // Update lowest if b is lower
        }
        if (c < lowest) {
            lowest = c; // Update lowest if c is lower
        }

        // Print the lowest number
        System.out.println("The lowest number among " + a + ", " + b + ", and " + c + " is " + lowest + ".");
        
        // Close the scanner
        scanner.close();
    }
}
