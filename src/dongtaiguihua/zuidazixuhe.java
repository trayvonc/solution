package dongtaiguihua;

public class zuidazixuhe {
    public static int maxSubArray(int[] nums) {
        //DP[i]表示到i为止的连续子序列最大和
        int []dp=new int[nums.length];
        dp[0]=nums[0];
        int result=dp[0];
        for(int i=1;i<nums.length;i++){
            dp[i]=Math.max(dp[i-1]+nums[i],nums[i]);
            if(dp[i]>result)result=dp[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
