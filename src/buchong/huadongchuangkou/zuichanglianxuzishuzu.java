package buchong.huadongchuangkou;

import java.util.HashMap;

public class zuichanglianxuzishuzu {
    public int lengthOfLongestSubstring(String s) {
        int left=0,right=0;
        int maxlen=0;
        HashMap<Character,Integer> map=new HashMap();
        while(right<s.length()){
            char c=s.charAt(right);
            if(map.containsKey(c)){
                left=Math.max(map.get(c)+1,left);
            }
            map.put(c,right);
            if(right-left+1>maxlen){
                maxlen=right-left+1;
            }
            right++;
        }
        return maxlen;
    }
}
