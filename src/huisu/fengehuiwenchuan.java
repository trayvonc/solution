package huisu;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class fengehuiwenchuan {
    List<List<String>> res=new ArrayList<>();
    LinkedList<String> path=new LinkedList<>();
    public List<List<String>> partition(String s) {
        backtrace(s,0);
        return res;
    }
    public void backtrace(String s,int startIndex){
        if(startIndex>=s.length()){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i=startIndex;i<s.length();i++){
            //获取startIndex到i的子串，设置结尾为切割位置
            if(isHuiWen(s,startIndex,i)){
                path.add(s.substring(startIndex,i+1));
            }
            else{//不是则跳过并剪枝
                continue;
            }
            //前面是path存储的回文数组，新建开始位置，并用for循环切割
            backtrace(s,i+1);
            path.removeLast();
        }
    }
    public boolean isHuiWen(String s,int startIndex,int index){
        for(int i=startIndex,j=index;i<=j;i++,j--){
            if(s.charAt(i)!=s.charAt(j))return false;
        }
        return true;
    }
}
