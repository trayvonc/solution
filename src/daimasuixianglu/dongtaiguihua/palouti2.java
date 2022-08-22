package daimasuixianglu.dongtaiguihua;

public class palouti2 {
    public int climbStairs(int n,int m) {//n是总台阶数量，m是最大步长
        int [] dp=new int[n+1];
        dp[0]=1;
        for(int j=1;j<=n;j++){
            for(int i=1;i<=m;i++){
                if(j>=i)
                    dp[j]+=dp[j-i];
            }
        }
        return dp[n];
    }
}
