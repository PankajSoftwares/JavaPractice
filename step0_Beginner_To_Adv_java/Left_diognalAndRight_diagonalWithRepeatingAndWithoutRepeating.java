public class Left_diognalAndRight_diagonalWithRepeatingAndWithoutRepeating {

    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int row = mat.length;
        int col = mat[0].length;

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(i == j){
                    System.out.print(mat[i][j] + " ");
                }
                System.out.println("");
            }
           // System.out.println("");
        };
        
        for(int k=0; k<row; k++){
            for(int l=0; l<row; l++){
                //if(k+l == )
                System.out.println(mat[k][l] + " ");
            }
        }
    }
}