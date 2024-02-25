import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        // Define an integer array with unsorted elements
        int[] numbers = {5, 3, 8, 4, 2, 7, 1, 6};

        // Print the original array
        System.out.println("Original array: " + Arrays.toString(numbers));

        // Sort the array
        Arrays.sort(numbers);

        // Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }
}
