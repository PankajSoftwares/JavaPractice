// https://www.hackerrank.com/challenges/missing-numbers/problem

import java.util.*;

public class _35_Missing_Numbers {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // Size of arr
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int m = in.nextInt(); // Size of brr (original array)
        int[] brr = new int[m];
        for (int i = 0; i < m; i++) {
            brr[i] = in.nextInt();
        }

        HashMap<Integer, Integer> freq = new HashMap<>();

        // Count frequencies in brr (original)
        for (int num : brr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Decrease counts based on arr (possibly missing some)
        for (int num : arr) {
            freq.put(num, freq.get(num) - 1);
        }

        // Collect numbers with count > 0
        ArrayList<Integer> missing = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > 0) {
                missing.add(entry.getKey());
            }
        }

        Collections.sort(missing);
        for (int num : missing) {
            System.out.print(num + " ");
        }
    }
}
