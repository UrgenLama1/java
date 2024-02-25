import java.util.Arrays;
import java.util.Scanner;

public class SortNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of names
        System.out.println("Enter the number of names: ");
        int n = scanner.nextInt(); // Reads the size 'n' for the array
        scanner.nextLine(); // Consume the newline left-over

        String[] names = new String[n]; // Create an array of size 'n'

        // Input 'n' names from the user
        for (int i = 0; i < n; i++) {
            System.out.println("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine(); // Store each name in the array
        }

        // Sorting the array in alphabetical order
        Arrays.sort(names);

        // Printing the names in alphabetical order
        System.out.println("Names in alphabetical order:");
        for (String name : names) {
            System.out.println(name);
        }
        
        scanner.close(); // Close the scanner to prevent resource leaks
    }
}
