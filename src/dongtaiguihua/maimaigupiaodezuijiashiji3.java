package dongtaiguihua;

public class maimaigupiaodezuijiashiji3 {
    public int maxProfit(int[] prices) {
        int[][]dp=new int[prices.length][5];
        dp[0][0]=0;//无操作后的现金
        dp[0][1]-=prices[0];//第一次买入
        dp[0][2]=0;//第一次卖出
        dp[0][3]-=prices[0];//第2次买入
        dp[0][4]=0;//第2次卖出
        for(int i=1;i<prices.length;i++){
            dp[i][1]=Math.max(dp[i-1][1],dp[i-1][0]-prices[i]);
            dp[i][2]=Math.max(dp[i-1][2],dp[i-1][1]+prices[i]);
            dp[i][3]=Math.max(dp[i-1][3],dp[i-1][2]-prices[i]);
            dp[i][4]=Math.max(dp[i-1][4],dp[i-1][3]+prices[i]);
        }
//        return Math.max(Math.max(dp[prices.length-1][0],dp[prices.length-1][2]),dp[prices.length-1][4]);
        return dp[prices.length-1][4];

    }
}
