package test;

import java.util.*;

public class solution {
    public List<List<Integer>> singleNumber(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        int k=0,i=0,j=0;
        for(k=0;k<nums.length;k++){
            if(nums[k]>0) break;
            if(k>0&&nums[k]==nums[k-1]) continue;
            i=k+1;j=nums.length-1;
            while(i<j){
                int sum=nums[k]+nums[i]+nums[j];
                if(sum<0){
                    while(i<j&&nums[i]==nums[++i]);
                }
                else if(sum>0){
                    while(i<j&&nums[i]==nums[--j]);
                }
                else{
                    res.add(new ArrayList<Integer>(Arrays.asList(nums[k],nums[i],nums[j])));
                    while(i<j&&nums[i]==nums[++i]);
                    while(i<j&&nums[i]==nums[--j]);
                }
            }
        }
        return res;

    }


    public static void main(String[] args){
        solution s=new solution();
        int[] a={};
        List<List<Integer>> res=s.singleNumber(a);
        System.out.println(res);
//        System.out.println("你好");


    }
}