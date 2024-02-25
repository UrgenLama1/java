import java.util.Scanner;

public class QuadraticEquationSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter coefficient a: ");
        double a = scanner.nextDouble();

        System.out.println("Enter coefficient b: ");
        double b = scanner.nextDouble();

        System.out.println("Enter coefficient c: ");
        double c = scanner.nextDouble();

        double determinant = b * b - 4 * a * c; // Calculate the determinant (b^2 - 4ac)

        // Check if determinant is greater than 0
        if (determinant > 0) {
            double root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            double root2 = (-b - Math.sqrt(determinant)) / (2 * a);
            System.out.println("The roots are real and different.");
            System.out.println("Root 1 = " + root1 + " and Root 2 = " + root2);
        }
        // Check if determinant is equal to 0
        else if (determinant == 0) {
            double root = -b / (2 * a);
            System.out.println("The roots are real and equal.");
            System.out.println("Root = " + root);
        }
        // If determinant is less than 0
        else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-determinant) / (2 * a);
            System.out.println("The roots are complex and different.");
            System.out.println("Root 1 = " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2 = " + realPart + " - " + imaginaryPart + "i");
        }
        
        scanner.close();
    }
}
