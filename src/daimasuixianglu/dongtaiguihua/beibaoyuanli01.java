package daimasuixianglu.dongtaiguihua;

public class beibaoyuanli01 {
    public static void testweightbagproblem(int[] weight, int[] value, int bagsize){
        int wlen=weight.length;
        int dp[][]=new int[wlen][bagsize+1];

        for(int i=weight[0];i<=bagsize;i++){
            dp[0][i]=value[0];
        }
        for(int i=1;i<wlen;i++){
            for(int j=0;j<=bagsize;j++){
                if(j<weight[i]) dp[i][j]=dp[i-1][j];//二维数组要有赋值操作
                else
                dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-weight[i]]+value[i]);

            }
        }
        System.out.println(dp[wlen-1][bagsize]);
    }

    public static void main(String[] args) {
        int[] weight = {1, 3, 4};
        int[] value = {15, 20, 30};
        int bagsize = 4;
        testweightbagproblem(weight, value, bagsize);
    }

}
