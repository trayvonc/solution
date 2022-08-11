package dongtaiguihua;

public class zuichanggonggongzixulie {//不要求连续，所以不能直接设置为0，要向前看
    public int longestCommonSubsequence(String text1, String text2) {
        int[][]dp=new int[text1.length()+1][text2.length()+1];
        //dp[i][j]为到下标i-1,j-1的最长公共子序列
        int res=0;
        for(int i=1;i<=text1.length();i++){
            for(int j=1;j<=text2.length();j++){
                if(text1.charAt(i-1)== text2.charAt(j-1))
                    dp[i][j]=dp[i-1][j-1]+1;
                else
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                res=Math.max(res,dp[i][j]);
            }
        }
        return res;
    }
}
