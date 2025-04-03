
public class SumOfEvenOddNumbers {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int sum_even = 0;
        int sum_odd = 0;

        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] % 2 == 0) {
                sum_even += arr[i];
            } else if (arr[i] % 2 != 0) {
                sum_odd += arr[i];
            }
        }
        System.out.println("Sum of even numbers: " + sum_even);
        System.out.println("Sum of odd numbers: " + sum_odd);
        // System.out.println("Sum of all numbers: " + (sum_even + sum_odd));

    }
}
