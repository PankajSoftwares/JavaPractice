package babyStep_very_beginner_java;

public class array {

    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = {1, 2, 3, 4, 5};
        
        // Print the elements of the array
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        
        // Calculate the sum of the array elements
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        
        // Print the sum of the array elements
        System.out.println("Sum of array elements: " + sum);
    }
    
}
