public class MatrixSum {
    public static void main(String[] args) {
        // Initialize two 2x2 matrices
        int[][] matrix1 = {{1, 2}, {3, 4}};
        int[][] matrix2 = {{5, 6}, {7, 8}};

        // Initialize a matrix to store the sum
        int[][] sum = new int[2][2];

        // Perform the matrix sum
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Print the result
        System.out.println("Sum of the two matrices is:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}
