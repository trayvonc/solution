package daimasuixianglu.huisu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class nhuanghou {
    List<List<String>> res=new ArrayList<>();
    boolean isValid(char[][]chessBoard,int row,int col,int n){
        for(int i=0;i<row;i++){
            if(chessBoard[i][col]=='Q')return false;
        }
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(chessBoard[i][j]=='Q')return false;
        }
        for(int i=row-1,j=col+1;i>=0&&j<n;i--,j++){
            if(chessBoard[i][j]=='Q')return false;
        }
        return true;
    }
    public List<List<String>> solveNQueens(int n) {
        char[][] chessBoard=new char[n][n];
        for(char[]  c:chessBoard){
            Arrays.fill(c,'.');
        }
        solveNQueens(chessBoard,n,0);
        return res;

    }
    public void solveNQueens(char[][]chessBoard,int n,int row){
        if(row==n){
            res.add(ArrayToList(chessBoard));
            return;
        }
        for(int col=0;col<n;col++){
            if(!isValid(chessBoard,row,col,n)) continue;
            chessBoard[row][col]='Q';
            solveNQueens(chessBoard,n,row+1);
            chessBoard[row][col]='.';

        }
    }
    public List<String> ArrayToList(char[][] array){
        List<String> list=new ArrayList<>();
        for(char[] c:array){
            list.add(String.copyValueOf(c));
        }
        return list;
    }
}
