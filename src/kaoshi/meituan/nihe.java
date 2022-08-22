package kaoshi.meituan;

import java.util.Scanner;

public class nihe {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int[]a=new int[n];
        int[]b=new int[m];
        for(int i=0;i<n;i++)a[i]=in.nextInt();
        for(int i=0;i<m;i++)b[i]=in.nextInt();
        int[][]dp=new int[m+1][n+1];
        //以i-1结尾和j-1结尾的数组相同花费最少时间
        for(int i=1;i<=m;i++) dp[i][0]=Math.abs(a[n-1]);
        for(int j=1;j<=m;j++) dp[0][j]=Math.abs(b[m-1]);
        for(int i=0;i<=m;i++){
            for(int j=1;j<=n;j++){
//                if()
            }
        }
    }
}
