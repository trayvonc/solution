package dongtaiguihua;

public class butongdezixulie {
    public int numDistinct(String s, String t) {
        int [][]dp=new int[s.length()+1][t.length()+1];
        //以i-1为结尾的s中出现以j-1为结尾的t的个数
        //dp[i][0]=1;dp[0][j]=0;dp[0][0]=1;
        for(int i=0;i<=s.length();i++) dp[i][0]=1;
        for(int i=1;i<=s.length();i++){
            for(int j=1;j<=t.length();j++){
                if(s.charAt(i-1)==t.charAt(j-1))
                    //如果相等，则dp由用s[i-1]和不用s[i-1]匹配组成
                    dp[i][j]=dp[i-1][j-1]+dp[i-1][j];
                else
                    dp[i][j]=dp[i-1][j];//不相等，不用他匹配
            }
        }
        return dp[s.length()][t.length()];
    }
}
