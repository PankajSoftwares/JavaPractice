//https://www.hackerrank.com/challenges/jim-and-the-orders/problem?isFullScreen=true

import java.util.*;

public class _39_Jim_and_the_Orders {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        // Each element: [customerIndex, deliveryTime]
        List<int[]> customers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int order = in.nextInt();
            int prep = in.nextInt();
            int deliveryTime = order + prep;
            customers.add(new int[]{i + 1, deliveryTime}); // i+1 because customers are 1-indexed
        }

        // Sort by deliveryTime, then customerIndex
        Collections.sort(customers, (a, b) -> {
            if (a[1] != b[1]) return a[1] - b[1];       // sort by delivery time
            return a[0] - b[0];                          // tie-breaker: customer index
        });

        // Print result
        for (int[] customer : customers) {
            System.out.print(customer[0] + " ");
        }
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
//       int []order=new int[n];
//       int [] prep=new int[n];
//       for(int i=0;i<n;i++){
//           order[i]=in.nextInt();
//           prep[i]=in.nextInt();
//       }
//       HashMap<Integer,Integer>mp=new HashMap<>();
//       int []delivery=new int[n];
//       for(int i=0;i<n;i++){
//           int deliveryTime=order[i]+prep[i];
//           delivery[i]=deliveryTime;
//           mp.put(deliveryTime,i+1);
//       }
//       Arrays.sort(delivery);
//       for(int i=0;i<n;i++){
//           int value=delivery[i];
//           System.out.print(mp.get(value)+" ");
//       }
      
//     }
// }
