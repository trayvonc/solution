package kaoshi.huadongchuangkou;

public class zuidalianxu1degeshu3 {
    public int longestOnes(int[] nums, int k) {
        //转换成最多k个0的最大长度
        int left=0,right=0;
        int zeros=0,len=0;
        while(right<nums.length){
            if(nums[right]==0) zeros++;
            while(zeros>k){
                if(nums[left]==0) zeros--;
                left++;
            }
            len=Math.max(right-left+1,len);
            right++;
        }
        return len;
    }
}
