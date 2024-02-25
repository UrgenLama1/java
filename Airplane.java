import java.util.Scanner;
class Airplane extends Fmachine {
    String code;
    String name;
    int capacity;

    @Override
    void getdata() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Airplane Code: ");
        code = scanner.nextLine();
        System.out.print("Enter Airplane Name: ");
        name = scanner.nextLine();
        System.out.print("Enter Airplane Capacity: ");
        capacity = scanner.nextInt();
    }

    @Override
    void putdata() {
        System.out.println("Airplane Code: " + code);
        System.out.println("Airplane Name: " + name);
        System.out.println("Airplane Capacity: " + capacity);
    }
}
