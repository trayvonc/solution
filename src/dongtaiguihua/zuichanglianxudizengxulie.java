package dongtaiguihua;

public class zuichanglianxudizengxulie {
    public int findLengthOfLCIS(int[] nums) {
        int [] dp=new int[nums.length];
        dp[0]=1;
        int max=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]) dp[i]=dp[i-1]+1;
            else dp[i]=1;
            max=Math.max(max,dp[i]);
        }
        return max;

    }
}
