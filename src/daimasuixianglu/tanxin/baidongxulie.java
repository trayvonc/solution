package daimasuixianglu.tanxin;

public class baidongxulie {
    public int wiggleMaxLength(int[] nums) {
        int result=1;//默认最后一个nums[i]是峰值
        int current=0,pre=0;
        for(int i=0;i<nums.length-1;i++){
            current=nums[i+1]-nums[i];
            if((current>0&&pre<=0)  || (current<0&&pre>=0)){
                result++;
                pre=current;
            }
        }
        return result;

    }
}
