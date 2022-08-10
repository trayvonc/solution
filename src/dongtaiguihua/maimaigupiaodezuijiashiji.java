package dongtaiguihua;

import java.util.ArrayList;
import java.util.HashMap;

public class maimaigupiaodezuijiashiji {
    //dp[i][0]第i天持有股票所得最多现金
    //dp[i][1]第i天不持有股票所得最多现金
    public int maxProfit(int[] prices) {
        int[][] dp=new int[prices.length][2];
        dp[0][0]-=prices[0];
        dp[0][1]=0;
        for(int i=1;i<prices.length;i++){
            dp[i][0]=Math.max(dp[i-1][0],-prices[i]);
            dp[i][1]=Math.max(dp[i-1][1],dp[i-1][0]+prices[i]);
        }
        return dp[prices.length-1][1];
    }
}
