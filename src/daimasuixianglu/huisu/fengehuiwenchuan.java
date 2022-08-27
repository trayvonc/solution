package daimasuixianglu.huisu;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class fengehuiwenchuan {
    static List<List<String>> res=new ArrayList<>();
    static LinkedList<String> path=new LinkedList<>();
    public static List<List<String>> partition(String s) {
        backtrace(s,0);
        return res;
    }
    public static void backtrace(String s,int startIndex){
        if(startIndex>=s.length()){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i=startIndex;i<s.length();i++){
            //同层剪枝
            if(!isHuiWen(s,startIndex,i)){
                continue;
            }
            //获取startIndex到i的子串
            path.add(s.substring(startIndex,i+1));
            //前面是path存储的回文数组，新建开始位置，并用for循环切割
            backtrace(s,i+1);
            path.removeLast();
        }
    }
    public static boolean isHuiWen(String s,int startIndex,int index){
        for(int i=startIndex,j=index;i<=j;i++,j--){
            if(s.charAt(i)!=s.charAt(j))return false;
        }
        return true;
    }
    public static void main(String[] args) {
        partition("abaadaa");
        for(List s:res){
            System.out.println(s);
        }
    }
}
