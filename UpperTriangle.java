public class UpperTriangle {
    public static void main(String[] args) {
        // Initialize a 3x3 matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Display the upper triangle
        System.out.println("Upper triangle of the matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // Print element if it's in the upper triangle
                if (j >= i) {
                    System.out.print(matrix[i][j] + " ");
                } else {
                    System.out.print("  "); // Print space for elements not in the upper triangle
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
