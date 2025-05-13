// https://www.hackerrank.com/challenges/find-digits/problem





import java.util.Scanner;

public class _33_Find_Digits {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        
        int t = in.nextInt();  // Number of test cases
        
        while (t-- > 0) {
            int n = in.nextInt();
            int num = n;
            int count = 0;
            
            while (num != 0) {
                int digit = num % 10;
                if (digit != 0 && n % digit == 0) {
                    count++;
                }
                num = num / 10;
            }
            
            System.out.println(count);
        }
    }
}

