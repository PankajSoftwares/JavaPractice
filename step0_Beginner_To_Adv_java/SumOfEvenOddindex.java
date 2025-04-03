public class SumOfEvenOddindex {
        public static void main(String[] args) {
    
            int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    
            int sum_even_index = 0;
            int sum_odd_index = 0;
    
            for (int i = 0; i <= arr.length - 1; i++) {
                if (i % 2 == 0) {
                    sum_even_index += arr[i];
                } else if (i % 2 != 0) {
                    sum_odd_index += arr[i];
                }
            }
            System.out.println("Sum of even index num is: " + sum_even_index);
            System.out.println("Sum of odd index num is: " + sum_odd_index);
            // System.out.println("Sum of all index no.: " + (sum_odd_index + sum_odd_index));
    
        }
    }
