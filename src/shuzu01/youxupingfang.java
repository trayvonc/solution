package shuzu01;

public class youxupingfang {
    public int[] func(int[] nums) {
        int left=0,right=nums.length-1;
        int[] res=new int[nums.length];
        int index=right;
        while(left<right){
            if(nums[left]*nums[left]>nums[right]*nums[right]){
                res[index]=nums[left]*nums[left];
                index--;
                left++;
            }
            else {
                res[index]=nums[right]*nums[right];
                index--;
                right--;
            }
        }
        res[0]=nums[left]+nums[left];
        return res;
    }

    public static void main(String[] args){
        youxupingfang s=new youxupingfang();
        int[] a={-4,-1,0,3,10};
        int[] res=s.func(a);
        for(int i:res) System.out.println(i);
    }
}
