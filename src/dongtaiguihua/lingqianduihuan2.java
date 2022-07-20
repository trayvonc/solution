package dongtaiguihua;

public class lingqianduihuan2 {
    public int change(int amount, int[] coins) {//先物品保证了完全背包放的顺序唯一，是组合数
        int[] dp=new int[amount+1];
        dp[0]=1;
        for(int i=0;i<coins.length;i++){
            for(int j=coins[i];j<=amount;j++){
                dp[j]+=dp[j-coins[i]];
            }
        }
        return dp[amount];
    }
    //后物品无法保证了完全背包放的顺序唯一，是排列数
}
