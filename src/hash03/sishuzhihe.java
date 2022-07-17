package hash03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sishuzhihe {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int k,i,left,right,sum;
        List<List<Integer>> res=new ArrayList<>();
        for(k=0;k<nums.length;k++){
//            if(nums[k]>target) return res; target为任意数，不可以提前返回
            if(k>0&&nums[k]==nums[k-1]) continue;
            for(i=k+1;i<nums.length;i++){
                if(i>k+1&&nums[i]==nums[i-1]) continue;
                left=i+1;
                right=nums.length-1;
                while(left<right){
                    sum=nums[k]+nums[i]+nums[left]+nums[right];
                    if(sum<target) left++;
                    else if(sum>target) right--;
                    else {
                        res.add(Arrays.asList(nums[k],nums[i],nums[left],nums[right]));
                        while(left<right&&nums[left]==nums[left+1])left++;
                        while(left<right&&nums[right]==nums[right-1])right--;
                        left++;
                        right--;
                    }
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        sishuzhihe s=new sishuzhihe();
        int[] in={2,2,2,2,2};
        System.out.println(s.fourSum(in,8));
    }
}
