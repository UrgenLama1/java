public class StudentNamesWithT {
    public static void main(String[] args) {
        // Define a String array of size 4 and store names of 4 students
        String[] studentNames = {"rahul", "roshan", "tenzing", "shanti"};

        System.out.println("Students whose name contains 't':");
        // Iterate through the array
        for (String name : studentNames) {
            // Check if the name contains the character 't'
            if (name.toLowerCase().contains("t")) {
                // Display the name
                System.out.println(name);
            }
        }
    }
}
