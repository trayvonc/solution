package daimasuixianglu.huisu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class zuhezonghe {
    List<List<Integer>> res=new ArrayList<>();
    LinkedList<Integer> path=new LinkedList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        back(res,path,candidates,target,0,0);
        return res;
    }
    void back(List<List<Integer>> res,LinkedList<Integer> path,int [] candidates,int target,int sum,int index){

        if(sum==target){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i=index;i<candidates.length;i++){
            if(sum+candidates[i]>target) break;
            path.add(candidates[i]);
            back(res,path,candidates,target,sum+candidates[i],i);
            path.removeLast();
        }

    }
}
