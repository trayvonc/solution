package daimasuixianglu.dongtaiguihua;

public class fengedengheziji {
    public static boolean canPartition(int[] nums) {
        int nlen=nums.length,sum=0;

        for(int i:nums)sum+=i;
        if(sum%2==1) return false;
        int target=sum/2;
        int [] dp=new int[target+1];//容量为j的背包，最多能装的数组和为dp[j]
        for(int i=0;i<nlen;i++){
            for(int j=target;j>=nums[i];j--){//背包容量为target
                dp[j]=Math.max(dp[j],dp[j-nums[i]]+nums[i]);
            }
        }
        if(target==dp[target])return true;//dp[j]最大为背包容量j，dp[j]<=j，当相等时说明存在组合使得和为一半
        return false;

    }

    public static void main(String[] args) {
        int [] nums={1,5,11,5};
        System.out.println(canPartition(nums));
    }
}
