public class PrimeNumbersbetRange {

    public static void main(String[] args) {
        int n = 20;

        for(int i=1; i<=n; i++){
            int count = 0;
            for(int j=1; j<=i; j++){
                if(i%j == 0){
                    count++;
                    //System.out.println("Non, Prime numbers: "+j);
                }
            }
            if(count==2){
                System.out.println("Prime numbers: "+n);
            }
        }
    }
}