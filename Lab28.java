import java.util.Scanner;

class Student {
    int age;
    String name;

    // Method to input age and name
    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.print("Enter age: ");
        age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline left-over
    }
}

public class Lab28 {
    public static void main(String[] args) {
        Student[] lstStudent = new Student[5]; // Array of 5 Student objects

        // Creating 5 objects of Student and storing in Array lstStudent
        for (int i = 0; i < lstStudent.length; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            lstStudent[i] = new Student();
            lstStudent[i].input();
        }

        // Print the name and age of students stored in array whose age is greater or equal to 24
        System.out.println("Students with age >= 24:");
        for (Student student : lstStudent) {
            if (student.age >= 24) {
                System.out.println("Name: " + student.name + ", Age: " + student.age);
            }
        }
    }
}
