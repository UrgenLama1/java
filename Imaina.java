import java.util.Scanner;

class Quadratic {
    double a, b, c, x1, x2;

    // Method to take user input for a, b, and c
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter coefficient a: ");
        a = scanner.nextDouble();
        System.out.print("Enter coefficient b: ");
        b = scanner.nextDouble();
        System.out.print("Enter coefficient c: ");
        c = scanner.nextDouble();
    }

    // Method to calculate the roots of the quadratic equation
    public void calculate() {
        double determinant = b * b - 4 * a * c;
        double sqrtVal = Math.sqrt(Math.abs(determinant));

        // Check if determinant is positive, negative or zero
        if (determinant > 0) {
            x1 = (-b + sqrtVal) / (2 * a);
            x2 = (-b - sqrtVal) / (2 * a);
        } else if (determinant == 0) {
            x1 = x2 = -b / (2 * a);
        } else { // determinant < 0, roots are complex
            x1 = -b / (2 * a);
            x2 = sqrtVal / (2 * a);
            System.out.println("Roots are complex.");
        }
    }

    // Method to display the roots of the quadratic equation
    public void display() {
        if (b * b - 4 * a * c >= 0) {
            System.out.println("Root x1 = " + x1);
            System.out.println("Root x2 = " + x2);
        } else {
            System.out.println("Root x1 = " + x1 + " + i" + x2);
            System.out.println("Root x2 = " + x1 + " - i" + x2);
        }
    }
}

public class Imaina {
    public static void main(String[] args) {
        Quadratic quadratic = new Quadratic(); // Create an object of Quadratic
        quadratic.input(); // Invoke input method to take user inputs
        quadratic.calculate(); // Calculate the roots
        quadratic.display(); // Display the roots
    }
}
