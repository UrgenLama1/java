class Rectangle {
    double length, breadth, area;

    // Method to compute the area of the rectangle
    public void computeArea() {
        area = length * breadth;
    }

    // Method to display the area of the rectangle
    public void displayArea() {
        System.out.println("Area: " + area);
    }

    // Getter method for area to compare rectangle areas
    public double getArea() {
        return area;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create the first Rectangle object
        Rectangle rectangle1 = new Rectangle();
        rectangle1.length = 5; // Example length
        rectangle1.breadth = 4; // Example breadth
        rectangle1.computeArea();

        // Create the second Rectangle object
        Rectangle rectangle2 = new Rectangle();
        rectangle2.length = 6; // Example length
        rectangle2.breadth = 7; // Example breadth
        rectangle2.computeArea();

        // Compare the areas of the two rectangles and display the area of the larger rectangle
        if (rectangle1.getArea() > rectangle2.getArea()) {
            System.out.print("The larger rectangle is Rectangle 1 with an ");
            rectangle1.displayArea();
        } else if (rectangle2.getArea() > rectangle1.getArea()) {
            System.out.print("The larger rectangle is Rectangle 2 with an ");
            rectangle2.displayArea();
        } else {
            System.out.println("Both rectangles have the same area.");
            rectangle1.displayArea(); // Or rectangle2.displayArea(), since they are equal
        }
    }
}
