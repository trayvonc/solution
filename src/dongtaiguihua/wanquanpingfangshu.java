package dongtaiguihua;

public class wanquanpingfangshu {
    public static int numSquares(int n) {//容量为n
        int [] dp=new int[n+1];//和为j的最少完全平方数数量为dp[j]
        for(int i=0;i<dp.length;i++) dp[i]=Integer.MAX_VALUE;
        dp[0]=0;

        for(int j=1;j<=n;j++){
            for(int i=1;i*i<=j;i++){
                if(dp[j-i*i]!=Integer.MAX_VALUE)
                dp[j]=Math.min(dp[j],dp[j-i*i]+1);
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(numSquares(1));
    }
}
