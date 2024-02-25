import java.util.Scanner;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        rectangle.get(); // Obtain rectangle dimensions from the user
        rectangle.display(); // Display the area of the rectangle
        
        System.out.println("---------------------");
        
        Shape square = new Square();
        square.get(); // Obtain square dimensions from the user
        square.display(); // Display the area of the square
    }
}
