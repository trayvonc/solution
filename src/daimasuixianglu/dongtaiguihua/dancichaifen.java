package daimasuixianglu.dongtaiguihua;

import java.util.HashSet;
import java.util.List;

public class dancichaifen {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[]dp=new boolean[s.length()+1];//dp[j]为true表示可以拆分
        dp[0]=true;
        HashSet<String> set=new HashSet<>(wordDict);
        for(int i=1;i<=s.length();i++){//遍历背包
            for(int j=0;j<i;j++){//遍历物品
                String word=s.substring(j,i);
                if(set.contains(word)&&dp[j]) dp[i]=true;
            }
        }
        return dp[s.length()];
    }

}
