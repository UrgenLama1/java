import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int subjects = 5;
        double marks[] = new double[subjects];
        double totalMarks = 0;
        boolean isPass = true;
        
        // Assume pass marks
        final int PASS_MARKS = 35;
        
        // Input marks for each subject
        for (int i = 0; i < subjects; i++) {
            System.out.println("Enter marks for subject " + (i + 1) + ":");
            marks[i] = scanner.nextDouble();
            
            // Check if the student failed in any subject
            if (marks[i] < PASS_MARKS) {
                isPass = false;
            }
            
            totalMarks += marks[i];
        }
        
        // Close the scanner
        scanner.close();
        
        // Calculate the percentage
        double percentage = (totalMarks / (subjects * 100)) * 100;
        
        // Print result
        if (isPass) {
            System.out.println("Total Marks: " + totalMarks + "/" + (subjects * 100));
            System.out.println("Percentage: " + percentage + "%");
            
            // Determine division
            if (percentage >= 60) {
                System.out.println("Division: First");
            } else if (percentage >= 45) {
                System.out.println("Division: Second");
            } else {
                System.out.println("Division: Third");
            }
        } else {
            System.out.println("Result: Fail");
        }
    }
}
