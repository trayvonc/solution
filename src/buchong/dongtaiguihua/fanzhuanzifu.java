package buchong.dongtaiguihua;

public class fanzhuanzifu {
    public int minFlipsMonoIncr(String s) {
        int n=s.length();
        int[][]dp=new int[n][2];//dp表示到i为止以0或1结尾的最小翻转次数
        dp[0][0]=s.charAt(0)=='0'?0:1;
        dp[0][1]=s.charAt(0)=='1'?0:1;
        for(int i=1;i<n;i++){
            if(s.charAt(i)=='0'){
                dp[i][0]=dp[i-1][0];
                dp[i][1]=Math.min(dp[i-1][0],dp[i-1][1])+1;
            }else if(s.charAt(i)=='1'){
                dp[i][0]=dp[i-1][0]+1;
                dp[i][1]=Math.min(dp[i-1][0],dp[i-1][1]);
            }
        }
        return Math.min(dp[n-1][0],dp[n-1][1]);

    }
}
