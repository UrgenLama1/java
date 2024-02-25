import java.util.Scanner;

class Quadratic {
    double a, b, c, x1, x2;

    // Method to take user input for a, b, and c
    public void Input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter coefficient a: ");
        a = scanner.nextDouble();
        System.out.print("Enter coefficient b: ");
        b = scanner.nextDouble();
        System.out.print("Enter coefficient c: ");
        c = scanner.nextDouble();
    }

    // Method to calculate the roots and return them
    public double[] Calculate() {
        double[] roots = new double[2];
        double determinant = b * b - 4 * a * c;
        double sqrtVal = Math.sqrt(Math.abs(determinant));

        if (determinant > 0) {
            x1 = (-b + sqrtVal) / (2 * a);
            x2 = (-b - sqrtVal) / (2 * a);
        } else if (determinant == 0) {
            x1 = x2 = -b / (2 * a);
        } else {
            // Assuming x1 and x2 to hold real and imaginary parts respectively for complex roots
            x1 = -b / (2 * a);
            x2 = sqrtVal / (2 * a);
            System.out.println("The equation has complex roots.");
        }
        
        roots[0] = x1;
        roots[1] = x2;
        return roots;
    }
}

public class Lab27{
    public static void main(String[] args) {
        Quadratic quadratic = new Quadratic(); // Create an object of Quadratic class
        quadratic.Input(); // Invoke Input method to take user inputs
        double[] roots = quadratic.Calculate(); // Calculate the roots and get them back
        
        // Display the roots
        System.out.println("Root 1 (x1) = " + roots[0]);
        System.out.println("Root 2 (x2) = " + roots[1]);
    }
}
