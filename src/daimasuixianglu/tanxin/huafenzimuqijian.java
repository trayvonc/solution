package daimasuixianglu.tanxin;

import java.util.ArrayList;
import java.util.List;

public class huafenzimuqijian {
    public List<Integer> partitionLabels(String s) {
        int[] hash=new int[26];
        for(int i=0;i<s.length();i++){
            hash[s.charAt(i)-'a']=i;
        }
        List<Integer>res=new ArrayList<>();
        int left=0;
        int right=0;
        for(int i=0;i<s.length();i++){
            right=Math.max(right,hash[s.charAt(i)-'a']);
            if(right==i){
                res.add(right-left+1);
                left=i+1;
            }
        }
        return res;

    }
}
