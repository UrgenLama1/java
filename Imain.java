import java.util.Scanner;

class Rectangle {
    double length, breadth, area;

    // Method to take user input for length and breadth
    public void set() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = scanner.nextDouble();
        System.out.print("Enter breadth: ");
        breadth = scanner.nextDouble();
    }

    // Method to calculate and display the area of the rectangle
    public void calculate() {
        area = length * breadth;
        System.out.println("Area of the rectangle: " + area);
    }
}

public class Imain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(); // Create an object of Rectangle
        rectangle.set(); // Invoke set method to take user inputs
        rectangle.calculate(); // Calculate and display the area of the rectangle
    }
}
