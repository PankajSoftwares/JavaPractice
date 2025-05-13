// https://www.hackerrank.com/challenges/tutorial-intro/problem?isFullScreen=true

import java.io.*;
import java.util.*;

public class _41_Intro_to_Tutorial_Challenges {
    public static void main(String args[]) {
        // Input reading
        Scanner in = new Scanner(System.in);
        int v = in.nextInt(); // The value to search for
        int n = in.nextInt(); // Size of the array
        int[] arr = new int[n];
        
        // Reading the array
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        // Using binary search to find the index of value v
        int index = Arrays.binarySearch(arr, v);

        // Print the index
        System.out.println(index);
    }
}


// import java.io.*;
// import java.util.*;
// // import java.text.*;
// // import java.math.*;
// // import java.util.regex.*;


// public class MyClass {
//     public static void main(String args[]) {
      
      
//       Scanner in = new Scanner(System.in);
//       int n=in.nextInt();
//       ArrayList<Integer>arr=new ArrayList<Integer>();
//       for(int i=0;i<n;i++){
//           int value=in.nextInt();
//           arr.add(value);
//       }
//       int v=in.nextInt();
//       int ans=0;
//       for(int i=0;i<n;i++){
//           int num=arr.get(i);
//           if(num==v){
//               ans=i;
//               break;
//           }
//       }
//       System.out.println(ans);
//     }
// }
