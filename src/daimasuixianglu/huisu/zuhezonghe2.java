package daimasuixianglu.huisu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class zuhezonghe2 {
    //组合去重
    List<List<Integer>> res=new ArrayList<>();
    LinkedList<Integer> path=new LinkedList<>();
    boolean[] visited;//用于同层相同元素去重
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        visited=new boolean[candidates.length];
        back(res,path,candidates,target,0,0);
        return res;
    }
    void back(List<List<Integer>> res,LinkedList<Integer> path,int[] candidates,int target,int sum,int index){
        if(sum==target){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i=index;i<candidates.length;i++){
            if(sum+candidates[i]>target) break;
            if(i>0&&candidates[i]==candidates[i-1]&&visited[i-1]==false) continue;
            path.add(candidates[i]);
            visited[i]=true;
            back(res,path,candidates,target,sum+candidates[i],i+1);
            path.removeLast();
            visited[i]=false;
        }
    }
}
