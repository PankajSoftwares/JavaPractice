//https://www.hackerrank.com/challenges/closest-numbers/problem

import java.util.*;

public class _37_Closest_Numbers {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        // Read input
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr); // Sort the array

        int minDiff = Integer.MAX_VALUE;

        // First pass: find the minimum difference
        for (int i = 1; i < n; i++) {
            int diff = arr[i] - arr[i - 1];
            if (diff < minDiff) {
                minDiff = diff;
            }
        }

        // Second pass: collect all pairs with the minimum difference
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            if (arr[i] - arr[i - 1] == minDiff) {
                result.add(arr[i - 1]);
                result.add(arr[i]);
            }
        }

        // Print result
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}

// import java.io.*;
// import java.util.*;
// // import java.text.*;
// // import java.math.*;
// // import java.util.regex.*;

// public class MyClass {
// public static void main(String args[]) {

// Scanner in = new Scanner(System.in);
// int n=in.nextInt();
// ArrayList<Integer>arr=new ArrayList<>();

// for(int i=0;i<n;i++){
// int value=in.nextInt();
// arr.add(value);
// }
// Collections.sort(arr);
// HashMap<Integer,Integer>mp=new HashMap<>();
// int min_diff=Integer.MAX_VALUE;
// for(int i=0;i<n-1;i++){
// int diff=arr.get(i+1)-arr.get(i);
// mp.put(i,diff);
// min_diff=Math.min(min_diff,diff);
// }
// ArrayList<Integer>ans=new ArrayList<Integer>();
// for(Integer key:mp.keySet()){
// if(mp.get(key)==min_diff){
// ans.add(arr.get(key));
// ans.add(arr.get(key+1));
// }
// }

// for(int i=0;i<ans.size();i++){
// System.out.print(ans.get(i)+" ");
// }
// }
// }
