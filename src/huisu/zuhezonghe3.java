package huisu;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class zuhezonghe3 {
    List<List<Integer>> result=new ArrayList<>();
    LinkedList<Integer> path=new LinkedList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        if(n>45)return result;
        backtracking(n,k,1,n);
        return result;
    }
    public void backtracking(int n,int k,int startIndex,int target){
        if(target<0) return;
        if(path.size()==k){
            if(target==0){
                result.add(new ArrayList<>(path));
            }
            return;
        }
        for(int i=startIndex;i<=9-(k-path.size())+1;i++){//n为树的宽度，k为树深度
            path.add(i);
            backtracking(n,k,i+1,target-i);
            path.removeLast();
        }
    }
}
