package dongtaiguihua;

public class lingqianduikuan {
    public static int coinChange(int[] coins, int amount) {//完全背包（顺序遍历容量）
        int [] dp=new int[amount+1];//组成j的最小硬币数
        for(int i=0;i<dp.length;i++) dp[i]=Integer.MAX_VALUE;
//        System.out.println(dp[0]);
        dp[0]=0;
        for(int i=0;i<coins.length;i++){
            for(int j=coins[i];j<=amount;j++){
                if(dp[j-coins[i]]!=Integer.MAX_VALUE)//不加这个会超出最大值变成负数
                    dp[j]=Math.min(dp[j],dp[j-coins[i]]+1);
            }
        }
        return dp[amount]!=Integer.MAX_VALUE?dp[amount]:-1;

    }

    public static void main(String[] args) {
        int[] coins={2};
        System.out.println(coinChange(coins,3));
    }
}
