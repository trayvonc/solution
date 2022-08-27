package daimasuixianglu.huisu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class zijiwenti2 {//包含重复，需要在本层去重
    List<List<Integer>> res=new ArrayList<>();
    LinkedList<Integer> path=new LinkedList<>();
    boolean [] used;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        used=new boolean[nums.length];
        Arrays.sort(nums);
        back(res,path,nums,0);
        return res;
    }
    void back(List<List<Integer>> res,LinkedList<Integer> path,int[]nums,int startIndex){
        res.add(new ArrayList<>(path));
        for(int i=startIndex;i<nums.length;i++){
            if(i>0&&nums[i]==nums[i-1]&&used[i-1]==false) continue;
            //如果本层第二次取这个数，会包含在上一层中，
            // 单个结果可以重复，但是res结果集不能重复
            path.add(nums[i]);
            used[i]=true;
            back(res,path,nums,i+1);
            path.removeLast();
            used[i]=false;
        }
    }
}
