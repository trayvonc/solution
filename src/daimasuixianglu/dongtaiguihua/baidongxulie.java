package daimasuixianglu.dongtaiguihua;

public class baidongxulie {
    public int wiggleMaxLength(int[] nums) {
        //和最大序列一样，当前的谷最大长度为之前峰最大长度加一
        //当前的峰最大长度为之前谷最大长度加一
        int[][]dp=new int[nums.length][2];
        dp[0][0]=1;dp[0][1]=1;//0为峰，1为谷
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j])dp[i][0]=Math.max(dp[i][0],dp[j][1]+1);
                if(nums[i]<nums[j])dp[i][0]=Math.max(dp[i][1],dp[j][0]+1);
            }
        }
        return Math.max(dp[nums.length][0],dp[nums.length][1]);
    }
}
