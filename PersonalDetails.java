import java.util.Scanner;

public class PersonalDetails {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt for and read the user's name
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        // Prompt for and read the user's gender
        System.out.println("Enter your gender: ");
        String gender = scanner.nextLine();

        // Prompt for and read the user's date of birth
        System.out.println("Enter your date of birth (e.g., DD/MM/YYYY): ");
        String dob = scanner.nextLine();

        // Print the collected information
        System.out.println("\nYour Details:");
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Date of Birth: " + dob);
        
        // Close the scanner
        scanner.close();
    }
}
