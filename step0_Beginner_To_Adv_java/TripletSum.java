public class TripletSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        // int n=arr.length-2;
        // int o=arr.length-1;
        // int  p= arr.length;

        for(int i=0; i<arr.length-2; i++ ){
            for (int j=i+1; j<arr.length-1; j++){
                for(int k=j+1; k<arr.length; k++){
                    
                    int sum = arr[i]+arr[j]+arr[k];
                    System.out.println("Sum of " +arr[i]+" and "+arr[j]+ " and "+arr[k]+" is: "+sum);
                }
            }
        }
    }
    
}
