package daimasuixianglu.tanxin;

public class zuidazixuhe {
    public int maxSubArray(int[] nums) {
        //当count目前子序和小于0的时候，就要结束，用下一个作为起点
        //因为当前的负数加上下一个数只会更小
        int sum=Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<nums.length;i++){
            count+=nums[i];
            sum=Math.max(sum,count);
            if(count<0){
                count=0;
            }
        }
        return sum;
    }

}
