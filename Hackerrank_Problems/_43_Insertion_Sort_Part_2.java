// https://www.hackerrank.com/challenges/insertionsort2/problem

    import java.io.*;
import java.util.*;

public class _43_Insertion_Sort_Part_2 {
    public static void main(String args[]) {
      
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        
        // Input array
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        
        // Perform insertion sort and print after each insertion
        for (int i = 1; i < n; i++) {  // Start from the second element
            int key = arr[i];
            int j = i - 1;
            
            // Shift elements of arr[0..i-1] that are greater than key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];  // Shift element to the right
                j = j - 1;
            }
            
            // Insert the key at the correct position
            arr[j + 1] = key;
            
            // Print the array after inserting the element
            for (int k = 0; k < n; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();  // New line after each print
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
//       int [] arr=new int[n];
//       for(int i=0;i<n;i++){
//           int value=in.nextInt();
//           arr[i]=value;
//       }
//       for(int i=0;i<n-1;i++){
//           int j=i+1;
//           while(j>0){
//               if(arr[j]<arr[j-1]){
//                   int temp=arr[j];
//                   arr[j]=arr[j-1];
//                   arr[j-1]=temp;
//                   j--;
//               }else{
//                   break;
//               }
//           }
//           for(int k=0;k<n;k++){
//               System.out.print(arr[k]+" ");
//           }
//           System.out.println();
//       }
//     }
// }
