package kaoshi.futu;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        int n=in.nextInt(),m=in.nextInt();
        int[] teng=new int[n];
        int[] hao=new int[n];
        for(int i=0;i<n;i++){
            teng[i]=in.nextInt();
            hao[i]=in.nextInt();
        }
        int[]dp=new int[m+1];
        for(int i=0;i<n;i++){
            for(int j=teng[i];j<=m;j++){
                dp[j]=Math.max(dp[j],dp[j-teng[i]]+hao[i]);
            }
        }
        System.out.println(dp[m]);
    }
}
