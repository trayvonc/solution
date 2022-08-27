package buchong.dongtaiguihua;

public class zuichanghuiwenzichuan {
    public String longestPalindrome(String s) {
        boolean [][] dp=new boolean[s.length()][s.length()];
        for(int i=0;i<s.length();i++) dp[i][i]=true;
        int left=0,right=0,max=1;
        for(int i=s.length()-1;i>=0;i--){
            for(int j=i;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    if(j-i<=1){
                        dp[i][j]=true;
                        if(j-i+1>max){
                            left=i;
                            right=j;
                            max=j-i+1;
                        }
                    }else if(dp[i+1][j-1]){
                        dp[i][j]=true;
                        if(j-i+1>max){
                            left=i;
                            right=j;
                            max=j-i+1;
                        }
                    }
                }
            }
        }
        return s.substring(left,right+1);
    }
}
