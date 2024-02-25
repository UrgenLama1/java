import java.util.Scanner;

class Rectangle implements Shape {
    int length, width, area;

    @Override
    public void get() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of the rectangle: ");
        length = scanner.nextInt();
        System.out.print("Enter width of the rectangle: ");
        width = scanner.nextInt();
    }

    @Override
    public void display() {
        area = length * width;
        System.out.println("Area of the rectangle: " + area);
    }
}
