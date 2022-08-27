package kaoshi.dongtaiguihua;

import java.util.Arrays;

public class kebei3zhengchudezuidahe {
    public static int maxSumDivThree(int[] nums) {
        int [][]dp=new int[nums.length][3];//到i为止，余数为j的最大和
//        Arrays.sort(nums);
        dp[0][1]=dp[0][2]=Integer.MIN_VALUE;
        if(nums[0]%3==0) dp[0][0]=nums[0];
        else if(nums[0]%3==1) dp[0][1]=nums[0];
        else if(nums[0]%3==2) dp[0][2]=nums[0];

        for(int i=1;i<nums.length;i++){
            if(nums[i]%3==0){
                dp[i][0]=dp[i-1][0]+nums[i];
                dp[i][1]=dp[i-1][1]+nums[i];
                dp[i][2]=dp[i-1][2]+nums[i];
            }
            else if(nums[i]%3==1){
                dp[i][0]=Math.max(dp[i-1][2]+nums[i],dp[i-1][0]);
                dp[i][1]=Math.max(dp[i-1][0]+nums[i],dp[i-1][1]);
                dp[i][2]=Math.max(dp[i-1][1]+nums[i],dp[i-1][2]);
            }
            else if(nums[i]%3==2){
                dp[i][0]=Math.max(dp[i-1][1]+nums[i],dp[i-1][0]);
                dp[i][1]=Math.max(dp[i-1][2]+nums[i],dp[i-1][1]);
                dp[i][2]=Math.max(dp[i-1][0]+nums[i],dp[i-1][2]);
            }
        }
        return dp[nums.length-1][0];
    }

    public static void main(String[] args) {
        int[] nums={3,6,5,1,8};
        System.out.println(maxSumDivThree(nums));
    }
}
