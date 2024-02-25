class Factorial {
    long result; // Use long to accommodate larger factorial values

    // Method to find the factorial of a given number n
    public long FindFact(int n) {
        result = 1; // Initialize result
        
        for (int i = 1; i <= n; i++) {
            result *= i; // Calculate factorial
        }
        
        return result; // Return the factorial
    }
}

public class Maina {
    public static void main(String[] args) {
        Factorial factorial = new Factorial(); // Create an object of Factorial class
        
        int number = 5; // Example number to find factorial of
        long fact = factorial.FindFact(number); // Call the FindFact method
        
        System.out.println("Factorial of " + number + " is: " + fact); // Print the result
    }
}
