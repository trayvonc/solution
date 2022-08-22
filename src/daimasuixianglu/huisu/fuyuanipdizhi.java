package daimasuixianglu.huisu;

import java.util.ArrayList;
import java.util.List;

//TODO 最近距离图



public class fuyuanipdizhi {
    static List<String>  res=new ArrayList<>();
    public static List<String> restoreIpAddresses(String s) {
        backtracking(s,0,0);
        return res;
    }
    static void backtracking(String s,int startIndex,int pointNum){
        if(pointNum==3){
            if(isIp(s.substring(startIndex))){
                res.add(s);
            }
            return;
        }
        for(int i=startIndex;i<s.length();i++){
            if(isIp(s.substring(startIndex,i+1))){
                s=s.substring(0,i+1)+'.'+s.substring(i+1);

            }else{
                break;//如果当前i不行，那之后的都不行，不用再尝试
            }
            backtracking(s,i+2,pointNum+1);
            s=s.substring(0,i+1)+s.substring(i+2);
        }

    }
    static boolean isIp(String s){
        if(s.length()>3||s.length()<1) return false;
        if(s.length()==1) return true;
        else {
            if(s.charAt(0)=='0') return false;
            if(Integer.parseInt(s)>255) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        restoreIpAddresses("101023");
        for(String s:res){
            System.out.println(s);
        }
    }
}
