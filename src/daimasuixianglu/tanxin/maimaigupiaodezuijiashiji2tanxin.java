package daimasuixianglu.tanxin;

public class maimaigupiaodezuijiashiji2tanxin {
    public int maxProfit(int[] prices) {
        //贪心只收集正利润
        int res=0;
        for(int i=1;i<prices.length;i++){
            res+=Math.max(prices[i]-prices[i-1],0);
        }
        return res;
    }
}
