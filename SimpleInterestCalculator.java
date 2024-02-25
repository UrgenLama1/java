import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask for principal amount
        System.out.println("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        // Ask for rate of interest
        System.out.println("Enter the rate of interest (in percentage): ");
        double rate = scanner.nextDouble();

        // Ask for time period
        System.out.println("Enter the time period (in years): ");
        double time = scanner.nextDouble();

        // Calculate simple interest
        double simpleInterest = (principal * rate * time) / 100;

        // Display the result
        System.out.println("The simple interest is: " + simpleInterest);
        
        // Close the scanner
        scanner.close();
    }
}
