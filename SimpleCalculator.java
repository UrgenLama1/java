import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double number1 = scanner.nextDouble();

        System.out.println("Enter the second number:");
        double number2 = scanner.nextDouble();

        System.out.println("Enter the operator (+, -, *, /):");
        char operator = scanner.next().charAt(0);

        double result;
        switch (operator) {
            case '+':
                result = number1 + number2;
                System.out.println("The sum is: " + result);
                break;
            case '-':
                result = number1 - number2;
                System.out.println("The difference is: " + result);
                break;
            case '*':
                result = number1 * number2;
                System.out.println("The product is: " + result);
                break;
            case '/':
                if (number2 != 0) {
                    result = number1 / number2;
                    System.out.println("The quotient is: " + result);
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;
            default:
                System.out.println("Invalid operator! Please use +, -, *, or /.");
                break;
        }
        
        scanner.close();
    }
}
