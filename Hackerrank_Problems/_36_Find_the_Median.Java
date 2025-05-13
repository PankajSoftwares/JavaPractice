//https://www.hackerrank.com/challenges/find-the-median/problem?isFullScreen=true

import java.util.*;

public class MyClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        
        Arrays.sort(arr);
        System.out.println(arr[n / 2]);
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
      
//       Collections.sort(arr);
//       int mid_ind=arr.size()/2;
//       System.out.println(arr.get(mid_ind));
//     }
// }
