package daimasuixianglu.dongtaiguihua;

import java.util.Scanner;

public class zhenshuchaifen {
    public static int integerBreak(int n) {
        int []dp=new int[n+1];
        dp[2]=1;
        for(int i=3;i<=n;i++){
            for(int j=1;j<=i-j;j++){
                dp[i]=Math.max(dp[i],Math.max(j*(i-j),j*dp[i-j]));
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        System.out.println(integerBreak(10));
    }
}
