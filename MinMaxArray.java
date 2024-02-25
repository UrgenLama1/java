public class MinMaxFromArray {
    public static void main(String[] args) {
        // Given array
        int[] array = {4, 1, 6, 19, 12, 7, 39, 11, 17, 21};
        
        // Initialize min and max with the first element of the array
        int min = array[0];
        int max = array[0];
        
        // Loop through the array to find min and max
        for(int i = 1; i < array.length; i++) {
            if(array[i] < min) min = array[i];
            if(array[i] > max) max = array[i];
        }
        
        // Print the min and max values
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }
}
