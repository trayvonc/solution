package daimasuixianglu.dongtaiguihua;

public class maimaigupiaodezuijiashiji2 {
    public int maxProfit(int[] prices) {
        int[][] dp=new int[prices.length][2];
        //持有的现金
        dp[0][0]-=prices[0];
        //不持有的现金
        dp[0][1]=0;
        for(int i=1;i<prices.length;i++){
            dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1]-prices[i]);//布置买一次，可以是上一次的利润再卖
            dp[i][1]=Math.max(dp[i-1][1],dp[i-1][0]+prices[i]);
        }
        return dp[prices.length-1][1];

    }
}
