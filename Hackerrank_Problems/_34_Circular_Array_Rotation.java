// https://www.hackerrank.com/challenges/circular-array-rotation/problem

import java.util.*;

public class _34_Circular_Array_Rotation {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt(); // size of array
        int k = in.nextInt(); // number of rotations
        int q = in.nextInt(); // number of queries

        int[] arr = new int[n];
        int[] rotated = new int[n];

        // Read original array
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        // Build rotated array
        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = arr[i];
        }

        // Process each query
        for (int i = 0; i < q; i++) {
            int idx = in.nextInt();
            System.out.println(rotated[idx]);
        }
    }
}
