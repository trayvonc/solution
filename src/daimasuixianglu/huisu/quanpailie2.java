package daimasuixianglu.huisu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class quanpailie2 {
    List<List<Integer>> res=new ArrayList<>();
    LinkedList<Integer> path=new LinkedList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean[]used=new boolean[nums.length];
        Arrays.sort(nums);
        permuteUniqueHelper(nums,used);
        return res;
    }
    public void permuteUniqueHelper(int[] nums,boolean[]used){
        if(path.size()==nums.length){
            res.add(new ArrayList<>(path));
        }
        for(int i=0;i<nums.length;i++){
            if(used[i])continue;
            if(i>0&&nums[i]==nums[i-1]&&used[i-1]==false)continue;
            used[i]=true;
            path.add(nums[i]);
            permuteUniqueHelper(nums,used);
            path.removeLast();
            used[i]=false;
        }
    }
}
