package hash03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sanshuzhihe {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int i,left,right;
        List<List<Integer>> res=new ArrayList<>();
        for(i=0;i<nums.length;i++){
            if(nums[i]>0)return res;
            if(i>0&&nums[i]==nums[i-1]) continue;//这种情况上位集合已经包含本位集合
            left=i+1;
            right=nums.length-1;
            while (left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==0){
                    res.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    //去重
                    while(left<right&&nums[right]==nums[right-1]) right--;
                    while(left<right&&nums[left]==nums[left+1]) left++;
                    //移位下一步判断
                    right--;
                    left++;
                }
                else if(sum<0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        sanshuzhihe s=new sanshuzhihe();
        int[] in={-1,0,1,2,-1,-4};
        System.out.println(s.threeSum(in));
    }
}
