//https://www.hackerrank.com/challenges/permutation-equation/problem

import java.io.*;
import java.util.*;

public class MyClass {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        HashMap<Integer, Integer> mp = new HashMap<>();
        
        // Map value -> index
        for (int i = 1; i <= n; i++) {
            int value = in.nextInt();
            mp.put(value, i);
        }

        for (int i = 1; i <= n; i++) {
            int x = mp.get(i);   // index of value i
            int y = mp.get(x);   // index of that index
            System.out.println(y);
        }
    }
}
