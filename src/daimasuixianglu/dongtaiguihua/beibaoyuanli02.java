package daimasuixianglu.dongtaiguihua;

public class beibaoyuanli02 {
    public static void testweightbagproblem(int[] weight, int[] value, int bagsize){
        int wlen=weight.length;
        int [] dp=new int[bagsize+1];//dp所有元素被初始化为0
        for(int i=0;i<wlen;i++){//遍历物品
            for(int j=bagsize;j>=weight[i];j--){//从后往前是为了不被加入多次
                dp[j]=Math.max(dp[j],dp[j-weight[i]]+value[i]);//和自身比较，没有复制操作
            }
        }
        System.out.println(dp[bagsize]);
    }

    public static void main(String[] args) {
        int[] weight = {1, 3, 4};
        int[] value = {15, 20, 30};
        int bagsize = 4;
        testweightbagproblem(weight, value, bagsize);
    }
}
