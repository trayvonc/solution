package shuzu01;

public class yichu {
    public Integer func(int[] nums, int val){
        Integer fast=0,slow=0;
        Integer len= nums.length;
        for(fast=0;fast<len;fast++){
            if(nums[fast]!=val){
                nums[slow]=nums[fast];
                slow++;
            }
            //找到和val相等元素，满指针就会停下，fast继续遍历找不等元素和slow交换
        }
        for(int i:nums) System.out.println(i);
        return slow;

    }

    public static void main(String[] args){
        yichu s=new yichu();
        int[] a={3,2,2,3};
        Integer res=s.func(a, 3);
        System.out.println(res);
//        System.out.println("你好");


    }
}
