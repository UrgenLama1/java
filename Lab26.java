class ArraySum {
    int sum; // Instance variable to store the sum

    // Method to calculate the sum of array elements
    public int Sum(int[] a) {
        sum = 0; // Initialize sum
        
        for (int i = 0; i < a.length; i++) {
            sum += a[i]; // Add each array element to sum
        }
        
        return sum; // Return the sum
    }
}

public class Lab26 {
    public static void main(String[] args) {
        ArraySum arraySum = new ArraySum(); // Create an object of ArraySum class
        
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Example array
        int totalSum = arraySum.Sum(array); // Call the Sum method
        
        System.out.println("Sum = " + totalSum); // Print the sum
    }
}
