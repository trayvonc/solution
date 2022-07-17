package shuzu01;

public class zuixiaozishuzu {
    public int func(int target,int[] nums){
        int left=0,right=0;
        int sum=0,length=0,res=Integer.MAX_VALUE;
        for(right=0;right<nums.length;right++){
            sum+=nums[right];
            while(sum>=target){
                length=right-left+1;
                res=length<res?length:res;
                sum-=nums[left++];
            }
        }

        return res== Integer.MAX_VALUE?0:res;
    }
    public static void main(String[] args){
        zuixiaozishuzu s=new zuixiaozishuzu();
        int[] a={2,3,1,2,4,3};
        int res=s.func(7,a);
        System.out.println(res);
    }
}
