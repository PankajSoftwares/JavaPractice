    import java.io.*;
import java.util.*;

public class _42_Insertion_Sort_Part_1 {
    public static void main(String args[]) {
      
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int[] arr = new int[n];
      
      // Read the input array
      for (int i = 0; i < n; i++) {
          arr[i] = in.nextInt();
      }

      int tmp = arr[arr.length - 1]; // Store the last element
      int i = arr.length - 2; // Start comparing from the second last element

      // Shift elements to the right until the correct position is found for tmp
      while (i >= 0 && arr[i] > tmp) {
          arr[i + 1] = arr[i]; // Shift the element to the right
          
          // Print the array after each shift
          for (int j = 0; j < n; j++) {
              System.out.print(arr[j] + " ");
          }
          System.out.println();
          i--;
      }

      // Insert the tmp at its correct position
      arr[i + 1] = tmp;

      // Print the array after insertion
      for (int j = 0; j < n; j++) {
          System.out.print(arr[j] + " ");
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
//       int []arr=new int[n];
//       for(int i=0;i<n;i++){
//           int value=in.nextInt();
//           arr[i]=value;
//       }
      
//       int tmp=arr[arr.length-1];
      
//       for(int i=arr.length-2;i>=0;i--){
//           if(tmp>=arr[i]){
//               arr[i+1]=tmp;
//               for(int j=0;j<n;j++){
//                   System.out.print(arr[j]+" ");
//               }
//               break;
//           }
//           arr[i+1]=arr[i];
//            for(int j=0;j<n;j++){
//                   System.out.print(arr[j]+" ");
//             }
//              System.out.println();
          
//       }
//       if(tmp<arr[0]){
//           arr[0]=tmp;
//           for(int i=0;i<n;i++){
//                   System.out.print(arr[i]+" ");
//             }
//       }
        
      
//     }
// }
