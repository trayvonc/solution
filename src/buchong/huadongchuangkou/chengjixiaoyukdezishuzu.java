package buchong.huadongchuangkou;

public class chengjixiaoyukdezishuzu {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) {
            return 0;
        }
        int left=0,right=0;
        int mul=1;
        int res=0;
        while(right<nums.length){
            mul*=nums[right];
            while(mul>=k){
                mul/=nums[left];
                left++;
            }
            //统计情况
            res+=right-left+1;
            right++;
        }
        return res;
    }
}
