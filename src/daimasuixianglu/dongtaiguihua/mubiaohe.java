package daimasuixianglu.dongtaiguihua;

public class  mubiaohe{
    public static int findTargetSumWays(int[] nums, int target) {
        int sum=0;
        for(int i:nums)sum+=i;
        if((sum+target)%2==1)return 0;
        if(Math.abs(target)>sum) return 0;
        int left=(sum+target)/2;
        int [] dp=new int[left+1];//填满包j一共有dp[j]种方法
        dp[0]=1;
        for(int i=0;i<nums.length;i++){
            for(int j=left;j>=nums[i];j--){//保证左边任然是上一层的,只被使用一次
                dp[j]+=dp[j-nums[i]];
            }
        }
//        for(int i:dp)
//        System.out.println(i);
        return dp[left];
    }

    public static void main(String[] args) {
        int [] nums={1,2,3,4,5};
        System.out.println(findTargetSumWays(nums,9));
    }
}
