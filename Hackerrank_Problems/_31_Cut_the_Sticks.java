// Link: https://www.hackerrank.com/challenges/cut-the-sticks/problem?isFullScreen=true

import java.io.*;
import java.util.*;

public class _31_Cut_the_Sticks {
    public static void main(String args[]) {
      
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();  // Number of sticks
        ArrayList<Integer> arr = new ArrayList<>();
        
        // Read the stick lengths
        for (int i = 0; i < n; i++) {
            arr.add(in.nextInt());
        }
        
        // Sort the array so we can easily find the shortest stick
        Collections.sort(arr);
        
        // Loop until all sticks are cut
        while (!arr.isEmpty()) {
            // Print the number of sticks remaining before each cut
            System.out.println(arr.size());
            
            // The shortest stick is the first element in the sorted array
            int min = arr.get(0);
            
            // Remove all sticks that are of length min
            while (!arr.isEmpty() && arr.get(0) == min) {
                arr.remove(0);
            }
        }
    }
}
