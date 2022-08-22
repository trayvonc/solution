package daimasuixianglu.zifuchuan04;

import java.util.HashSet;

public class wuchongfuzifudezichangzichuan {//滑动窗口
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hashSet=new HashSet<>();
        int rp=-1,res=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            if(i!=0){
                hashSet.remove(s.charAt(i-1));
            }
            while(rp<n-1&&!hashSet.contains(s.charAt(rp+1))){
                hashSet.add(s.charAt(rp+1));
                rp++;
            }
            res=Math.max(res,rp-i+1);
        }
        return res;
    }
}
