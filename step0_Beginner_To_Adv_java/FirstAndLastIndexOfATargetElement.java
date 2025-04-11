public class FirstAndLastIndexOfATargetElement {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,8,9};
        int targetElement = 8;
        int n = arr.length;

        for(int i = 0; i < n; i++){
            if(arr[i]==arr[n-1-i]){
                System.out.println("First and last index of target element " + targetElement + " is: " + i + " and " + (n-1-i));
                break;
            }
        }
    }
}
