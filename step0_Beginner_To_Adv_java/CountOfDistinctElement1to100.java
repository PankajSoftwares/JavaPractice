import java.util.Arrays;
public class CountOfDistinctElement1to100 {

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 3, 6, 2};
        int n = arr.length;
        boolean[] vis = new boolean[101]; // 0 to 100
        Arrays.fill(vis, false); // Initialize all elements to false
        int count = 0;
        for (int i =0; i<n; i++){
            if((vis[arr[i]])==false){
                count++;
                vis[arr[i]] = true; // Mark the element as visited           
            }
        }
        System.out.println("Count of distict elements in the given array between 1 to 100 is:"+count);
    }
}