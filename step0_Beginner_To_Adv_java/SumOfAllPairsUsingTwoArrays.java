import java.util.*;

public class SumOfAllPairsUsingTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int n = arr1.length;
        int m = arr2.length;
        int sum = 0;
        int Total_sum = 0;
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                sum = arr1[i] + arr2[j];
                Total_sum += arr1[i] + arr2[j];

                System.out.println("Sum of " + arr1[i] + " and " + arr2[j] + " is: " + (sum));
            }
        }
        System.out.println("Total_sum: "+Total_sum);

    }
    
}
