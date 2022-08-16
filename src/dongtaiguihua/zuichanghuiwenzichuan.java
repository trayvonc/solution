package dongtaiguihua;
//给你一个字符串 s，找到 s 中最长的回文子串。
//
//         
//
//        示例 1：
//
//        输入：s = "babad"
//        输出："bab"
//        解释："aba" 同样是符合题意的答案。
//        示例 2：
//
//        输入：s = "cbbd"
//        输出："bb"

public class zuichanghuiwenzichuan {
    public String longestPalindrome(String s) {
        boolean [][] dp=new boolean[s.length()][s.length()];
        //从i到j是否是回文子串,遍历顺序,从下往上，从左往右
        for(int i=0;i<s.length();i++)dp[i][i]=true;
        int x=0,y=0;

        for(int i=s.length()-1;i>=0;i--){
            for(int j=i;j<s.length();j++){
                if(s.charAt(i)!=s.charAt(j)){
                    dp[i][j]=false;
                }else{//i和j字符相同
                    if(i==j){
                        dp[i][j]=true;
                    }else if(i==j-1){
                        dp[i][j]=true;
                    }else{
                        dp[i][j]=dp[i+1][j-1];
                    }

                }
                if(dp[i][j]==true&&j-i>y-x){
                    y=j;
                    x=i;
                }
            }
        }
        return s.substring(x,y+1);

    }
}
