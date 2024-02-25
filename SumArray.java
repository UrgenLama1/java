import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the size of the array: ");
        int n = scanner.nextInt();
        
        int[] array = new int[n];
        int sum = 0;
        
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            sum += array[i];
        }
        
        System.out.println("Sum = " + sum);
        
        scanner.close();
    }
}
