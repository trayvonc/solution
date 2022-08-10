package dongtaiguihua;

import java.util.Arrays;

public class zuichangshangshengzixulie {
    public int lengthOfLIS(int[] nums) {
        int[]dp=new int[nums.length];
        Arrays.fill(dp,1);
        int result=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j])
                    dp[i]=Math.max(dp[i],dp[j]+1);
            }
            result=Math.max(dp[i],result);
        }
        return result;
    }
}
