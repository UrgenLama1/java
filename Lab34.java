import java.util.Arrays;

public class Lab34 {
    public static void main(String[] args) {
        // Create a String array and store country names
        String[] countries = {"India", "Australia", "United States", "Canada", "Germany"};

        // Sort the array in alphabetical order
        Arrays.sort(countries);

        // Display the country names in alphabetical order
        System.out.println("Countries in alphabetical order:");
        for (String country : countries) {
            System.out.println(country);
        }
    }
}
