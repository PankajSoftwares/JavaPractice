//https://www.hackerrank.com/challenges/sherlock-and-array/problem?isFullScreen=true

import java.util.*;

public class _38_Sherlock_and_Array {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); // number of test cases

        while (t-- > 0) {
            int n = in.nextInt();
            int[] arr = new int[n];

            int totalSum = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
                totalSum += arr[i];
            }

            int leftSum = 0;
            boolean found = false;
            for (int i = 0; i < n; i++) {
                int rightSum = totalSum - leftSum - arr[i];
                if (leftSum == rightSum) {
                    found = true;
                    break;
                }
                leftSum += arr[i];
            }

            System.out.println(found ? "YES" : "NO");
        }
    }
}




// import java.io.*;
// import java.util.*;
// // import java.text.*;
// // import java.math.*;
// // import java.util.regex.*;
// import java.util.Scanner;


// public class MyClass {
//     public static void main(String args[]) {
      
      
//       Scanner in = new Scanner(System.in);
//       int n=in.nextInt();
//       ArrayList<Integer>arr=new ArrayList<>();
//       for(int i=0;i<n;i++){
//           int value=in.nextInt();
//           arr.add(value);
//       }
      
//       int total_sum=0;
//       for(int i=0;i<arr.size();i++){
//           total_sum+=arr.get(i);
//       }
//       boolean flag=false;
//       int curr_sum=0;
//       for(int i=0;i<arr.size();i++){
//           curr_sum+=arr.get(i);
//           if(curr_sum==total_sum){
//               flag=true;
//               break;
//           }
//           total_sum-=arr.get(i);
//       }
//       if(flag==true){
//           System.out.println("Yes");
//       }else{
//          System.out.println("No"); 
//       }
//     }
// }
