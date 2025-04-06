public class CountOfOddAndEvenTripletSum {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 ,7};
        int even_sum = 0;
        int odd_sum = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    int sum = arr[i] + arr[j] + arr[k];

                    if (sum % 2 == 0) {
                        even_sum++;
                       // System.out.println("Even triplet sum: " + arr[i] + "+" + arr[j] + "+" + arr[k] + " = " + sum);
                    } else {
                        odd_sum++;
                        //System.out.println("Odd triplet sum: " + arr[i] + "+" + arr[j] + "+" + arr[k] + " = " + sum);
                    }
                }
            }
        }
        System.out.println("Total even triplet sums: " + even_sum);
        System.out.println("Total odd triplet sums: " + odd_sum);
    }
}

// Expected Output:
// Total even triplet sums: 19
// Total odd triplet sums: 16