
class Solution {
    public void rotate(int[][] matrix) {
        
        reverse(matrix);
        transpose(matrix);
        
        
        
    }

    public void transpose(int[][] matrix){

        for(int i = 0 ;i<matrix.length-1;i++){

            for(int j = i+1 ; j<matrix[0].length;j++ ){

                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;


            }


        }
    }

    public void reverse(int[][] matrix){

             for(int i = 0 ;i<matrix.length;i++){

            for(int j = 0 ; j<matrix[0].length/2 ;j++ ){

                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[i][matrix[0].length-1-j];
                    matrix[i][matrix[0].length -1 -j ] = temp;


            }


        }

    }
}
