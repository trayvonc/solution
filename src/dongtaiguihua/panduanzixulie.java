package dongtaiguihua;

public class panduanzixulie {
    public boolean isSubsequence(String s, String t) {
        int [][]dp=new int[s.length()+1][t.length()+1];
        for(int i=1;i<=s.length();i++){
            for(int j=1;j<=t.length();j++){
                if(s.charAt(i-1)==t.charAt(j-1))
                    dp[i][j]=dp[i-1][j-1]+1;
                else
                    //s当前元素i- 1不变，t要删除当前元素，用s[i - 1]与 t[j - 2]比较
                    dp[i][j]=dp[i][j-1];

            }
        }
        return dp[s.length()][t.length()]==s.length()?true:false;
    }
}
