import java.util.Scanner;

class Square implements Shape {
    int side, area;

    @Override
    public void get() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side of the square: ");
        side = scanner.nextInt();
    }

    @Override
    public void display() {
        area = side * side;
        System.out.println("Area of the square: " + area);
    }
}
