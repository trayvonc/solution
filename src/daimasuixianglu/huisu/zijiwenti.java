package daimasuixianglu.huisu;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class zijiwenti {
    List<List<Integer>> res=new ArrayList<>();
    LinkedList<Integer> path=new LinkedList<>();
    public List<List<Integer>> subsets(int[] nums) {
        back(res,path,nums,0);
        return res;
    }
    void back(List<List<Integer>> res,LinkedList<Integer> path,int[]nums,int startIndex){
        res.add(new ArrayList<>(path));
        for(int i=startIndex;i<nums.length;i++){
            path.add(nums[i]);
            back(res,path,nums,i+1);
            path.removeLast();
        }
    }
}
