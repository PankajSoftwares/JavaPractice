public class SumOfTwoPairs {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6};
        int n=array.length;
        System.out.println(n);
        int sum=0;
        int i=0;
        int j=0;
        for(i=0; i<n-1; i++){  /// n-1 ensures last element isn't paired with itself and array index it's n-1.
            for( j=i+1; j<n; j++){ //ensures that the same element starts from i+1 then it will run till n.
                sum += array[i]+array[j];
                System.out.println("Sum of " + array[i] + " and " + array[j] + " is: " + (array[i]+array[j]));
            }
        }
        System.out.println("Total sum of all pairs is: " + sum);
    }
}
