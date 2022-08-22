package daimasuixianglu.dongtaiguihua;

public class yiheling {//两个维度的一维01背包
    public int findMaxForm(String[] strs, int m, int n) {//最多有i个0和j个1的strs的最大子集的大小为dp[i][j]
        int [][]dp=new int[m+1][n+1];
        for(String str:strs){
            int zeroNum=0,oneNum=0;
            for(char c:str.toCharArray()){
                if(c=='0') zeroNum++;
                else oneNum++;
            }
            for(int i=m;i>=zeroNum;i--){
                for(int j=n;j>=oneNum;j--){
                    dp[i][j]=Math.max(dp[i][j],dp[i-zeroNum][j-oneNum]+1);
                }
            }

        }
        return dp[m][n];
    }
}
