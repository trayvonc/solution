package daimasuixianglu.huisu;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class dizengzixulie {
    List<List<Integer>> res=new ArrayList<>();
    LinkedList<Integer> path=new LinkedList<>();

    public List<List<Integer>> findSubsequences(int[] nums) {
        getSubsequences(nums,0);
        return res;
    }
    private void getSubsequences( int[] nums, int startIndex ) {
        if(path.size()>1){
            res.add(new ArrayList<>(path));
        }
        HashSet<Integer> set=new HashSet<>();//只控制层
        for(int i=startIndex;i<nums.length;i++){
            if(set.contains(nums[i])||(!path.isEmpty()&&nums[i]<path.getLast())){
                continue;
            }
            set.add(nums[i]);
            path.add(nums[i]);
            getSubsequences(nums,i+1);
            path.removeLast();

        }
    }
}
