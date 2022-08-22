package daimasuixianglu.dongtaiguihua;

public class zuihouyikuaishitoudezhongliang {
    public static int lastStoneWeightII(int[] stones) {
        int slen=stones.length,sum=0;
        for(int i:stones)sum+=i;
        int target=sum/2;
        int [] dp=new int[target+1];
        for(int i=0;i<slen;i++){
            for(int j=target;j>=stones[i];j--){
                dp[j]=Math.max(dp[j],dp[j-stones[i]]+stones[i]);
            }
        }
        return (sum-dp[target])-dp[target];
    }

    public static void main(String[] args) {
        int [] nums={2,7,4,1,8,1};
        System.out.println(lastStoneWeightII(nums));
    }
}
