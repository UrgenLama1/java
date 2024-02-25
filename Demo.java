public class Demo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int sum = calc.add(5, 3); // Example usage of add
        int difference = calc.diff(5, 3); // Example usage of diff

        System.out.println("Sum: " + sum); // Outputs: Sum: 8
        System.out.println("Difference: " + difference); // Outputs: Difference: 2
    }
}
