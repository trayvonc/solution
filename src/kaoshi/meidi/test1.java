package kaoshi.meidi;

public class test1 {
    public int minValue (int[][] matrix) {
        // write code here
        int row=matrix.length,col=matrix[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==0&&j==0){
                    continue;
                } else if (i==0) {
                    matrix[i][j]=matrix[i][j-1]+matrix[i][j];
                }else if (j==0) {
                    matrix[i][j]=matrix[i-1][j]+matrix[i][j];
                }else  {
                    matrix[i][j]=Math.min(matrix[i][j-1],matrix[i-1][j])+matrix[i][j];
                }
            }
        }
        return matrix[row-1][col-1];
    }
}
