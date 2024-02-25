import java.util.Scanner;

public class CompoundInterestCalculator {
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

        // Ask for number of times interest applied per time period
        System.out.println("Enter the number of times interest is compounded per year: ");
        int compoundFrequency = scanner.nextInt();

        // Calculate compound interest
        double compoundInterest = principal * Math.pow((1 + rate / 100 / compoundFrequency), compoundFrequency * time) - principal;

        // Display the result
        System.out.println("The compound interest is: " + compoundInterest);
        
        // Close the scanner
        scanner.close();
    }
}
