// https://www.hackerrank.com/challenges/mark-and-toys/problem?isFullScreen=true



import java.io.*;
import java.util.*;

public class _40_Mark_and_Toys {
    public static void main(String args[]) {
        // Reading input
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();  // number of toys
        int budget = in.nextInt();  // budget
        
        // Read toy prices
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = in.nextInt();
        }

        // Sort the prices in ascending order
        Arrays.sort(prices);

        // Variables to keep track of sum and count of toys bought
        int sum = 0;
        int count = 0;

        // Iterate through the sorted prices
        for (int price : prices) {
            if (sum + price <= budget) {
                sum += price;
                count++;
            } else {
                break;  // Once the budget is exceeded, stop buying more toys
            }
        }

        // Output the maximum number of toys
        System.out.println(count);
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
//       int b=in.nextInt();
//       ArrayList<Integer>arr=new ArrayList<>();
//       for(int i=0;i<n;i++){
//           int value=in.nextInt();
//           arr.add(value);
//       }
//       Collections.sort(arr);
//       int sum=0;
//       int count=0;
//       for(int i=0;i<arr.size();i++){
//           if(sum+arr.get(i)<=b){
//               sum+=arr.get(i);
//               count++;
//           }else{
//               break;
//           }
//       }
//       System.out.println(count);
      
//     }
// }
