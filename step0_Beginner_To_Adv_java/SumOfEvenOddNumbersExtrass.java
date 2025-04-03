import java.util.*;
//SumOfEvenOddNumbersExtrass

public class SumOfEvenOddNumbersExtrass {
    public void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the size of the list
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        List<Integer> numbers = new ArrayList<>();

        // Taking input for list elements
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }

        // Initializing sums
        int sum_even = 0;
        int sum_odd = 0;

        // Iterating using a traditional for-loop
        for (int i = 0; i < numbers.size(); i++) {
            int num = numbers.get(i);
            if (num % 2 == 0) {
                sum_even += num;
            } else {
                sum_odd += num;
            }
        }

        // Displaying results
        System.out.println("Sum of even numbers: " + sum_even);
        System.out.println("Sum of odd numbers: " + sum_odd);
        System.out.println("Sum of all numbers: " + (sum_even + sum_odd));

        // Iterating using a for-each loop (alternative way)
        System.out.print("Even numbers: ");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        System.out.print("Odd numbers: ");
        for (int num : numbers) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        // Finding the largest and smallest number
        int max = numbers.get(0);
        int min = numbers.get(0);
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Largest number: " + max);
        System.out.println("Smallest number: " + min);

        // Checking if a number exists
        System.out.print("Enter a number to check if it exists in the list: ");
        int checkNum = scanner.nextInt();
        if (numbers.contains(checkNum)) {
            System.out.println(checkNum + " is present in the list.");
        } else {
            System.out.println(checkNum + " is NOT present in the list.");
        }

        // Closing scanner
        scanner.close();
    }
}
