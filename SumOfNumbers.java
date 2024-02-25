import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first integer: ");
        // Read the first integer from the user
        int firstNumber = scanner.nextInt();

        System.out.println("Enter second integer: ");
        // Read the second integer from the user
        int secondNumber = scanner.nextInt();

        // Calculate the sum of both integers
        int sum = firstNumber + secondNumber;

        // Display the result
        System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is " + sum + ".");
        
        // Close the scanner
        scanner.close();
    }
}
