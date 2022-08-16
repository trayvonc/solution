package kaoshi.huadongchuangkou;

import java.util.HashMap;

public class zifuchuandepailie {
    //https://leetcode.cn/problems/subarray-product-less-than-k/solution/jian-dan-yi-dong-xiang-xi-zhu-jie-shuang-jvy3/
    //滑动窗口通解
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> need=new HashMap<>();
        HashMap<Character,Integer> map=new HashMap<>();
        for(char i:s1.toCharArray()){
            need.put(i,need.getOrDefault(i,0)+1);
        }
        int left=0,right=0;int valid=0;
        while(right<s2.length()){
            char c=s2.charAt(right);
            if(need.containsKey(c)){
                map.put(c,map.getOrDefault(c,0)+1);
                if(need.get(c).equals(map.get(c)))valid++;
            }
           while(right-left+1>=s1.length()){
               if(valid==need.size()&&right-left+1==s1.length())return true;
               char d=s2.charAt(left);
               if(need.containsKey(d)){
                   if(need.get(d).equals(map.get(d))) valid--;
                   map.put(d,map.getOrDefault(d,0)-1);
               }
               left++;
           }
            right++;

        }
        return false;
    }
}
