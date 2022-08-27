package buchong.huadongchuangkou;

import java.util.HashMap;

public class wuchongfuzifudezuichangzichuan {
    public int lengthOfLongestSubstring(String s) {
        int right=0,left=0;
        int res=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while(right<s.length()){
            char c=s.charAt(right);
            if(map.containsKey(c)){
                left=Math.max(map.get(c)+1,left);

            }
            map.put(c,right);
            res=Math.max(right-left+1,res);
            right++;

        }
        return res;
    }
}
