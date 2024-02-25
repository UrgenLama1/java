public class StarPattern {
    public static void main(String[] args) {
        int rows = 5; // Total number of rows in the pattern

        for (int i = 1; i <= rows; i++) {
            // First half of the pattern
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            // Space between the two halves from the third row
            if (i > 2) {
                int space = 2 * (i - 2);
                for (int j = 1; j <= space; j++) {
                    System.out.print(" ");
                }
            }
            
            // Second half of the pattern, omitting the second half for the first two rows
            if (i > 2) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            }
            
            // Move to the next line after each row
            System.out.println();
        }
    }
}
