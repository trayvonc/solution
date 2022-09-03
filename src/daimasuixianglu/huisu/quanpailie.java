package daimasuixianglu.huisu;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class quanpailie {
     List<List<Integer>> res=new ArrayList<>();
     LinkedList<Integer> path=new LinkedList<>();
    public List<List<Integer>> permute(int[] nums) {
        boolean[]used=new boolean[nums.length];
        permuteHelper(nums,used);
        return res;
    }
    public void permuteHelper(int []nums,boolean[] used){
        if(path.size()==nums.length){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i])continue;
            used[i]=true;
            path.add(nums[i]);
            permuteHelper(nums,used);
            path.removeLast();
            used[i]=false;
        }
    }
}