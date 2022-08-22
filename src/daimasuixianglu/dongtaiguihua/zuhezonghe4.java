package daimasuixianglu.dongtaiguihua;

public class zuhezonghe4 {
    public int combinationSum4(int[] nums, int target) {//求得排列数量，即要求先遍历容量再遍历物品
        int[]dp=new int[target+1];
        dp[0]=1;
        for(int j=0;j<=target;j++){
            for(int i=0;i<nums.length;i++){
                if(j>=nums[i]) dp[j]+=dp[j-nums[i]];
            }


        }
        return dp[target];
    }
}
