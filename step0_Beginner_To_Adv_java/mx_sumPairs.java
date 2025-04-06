public class mx_sumPairs {
    
    public static void main(String args[]){
        int arr1[] = {1, 2, 3, 4};
        int arr2[] = {5, 6, 7, 8};

        int n = arr1.length;
        int m = arr2.length;

        int mx_sum = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                int sum = arr1[i] + arr2[j];
                //mx_sum = Math.max(mx_sum, sum);
                //or
                if(sum>mx_sum){
                    mx_sum = sum;
                }
                System.out.println("Sum of " + arr1[i] + " and " + arr2[j] + " is: " + (sum));
            }
        }
        System.out.println("Max sum so far: " + mx_sum);
    }
}
