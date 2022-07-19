package dongtaiguihua;

public class wanquanbeibao {
     //先物品再容量
    public static int wanquan(int[] weight,int[] value,int bagSize){
        int wlen=weight.length;
        int [] dp=new int[bagSize+1];
        for(int i=0;i<wlen;i++){
            for(int j=weight[i];j<=bagSize;j++){
                dp[j]=Math.max(dp[j],dp[j-weight[i]]+value[i]);
            }
        }
        return dp[bagSize];
    }
    //先容量再武平
    public static int wanquan1(int[] weight,int[] value,int bagSize){
        int wlen=weight.length;
        int [] dp=new int[bagSize+1];

        for(int j=0;j<=bagSize;j++){
            for(int i=0;i<wlen;i++){
                if(j>=weight[i])
                dp[j]=Math.max(dp[j],dp[j-weight[i]]+value[i]);
                //省略 else dp[j]=dp[j];
            }
        }
        return dp[bagSize];
    }

    public static void main(String[] args) {
        int [] weight={1,3,4};
        int [] value={15,20,30};
        System.out.println(wanquan(weight,value,4));
        System.out.println(wanquan1(weight,value,4));
    }
}
