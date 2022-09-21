package daimasuixianglu.tanxin;

public class maimaigupiaodezuijiashijihanshouxufeitanxin {
    public static int maxProfit(int[] prices, int fee) {
        int minPrice=prices[0];
        int res=0;
        for(int i=0;i<prices.length;i++){
            //这一天买入
            if(prices[i]<minPrice) minPrice=prices[i];
            //不是买入日且无法获利
            if(prices[i]>=minPrice&&prices[i]-minPrice-fee<=0)
                continue;
            if(prices[i]>minPrice+fee){//这天卖出获利
                res+=prices[i]-minPrice-fee;
                minPrice=prices[i]-fee;//防止多次付手续费

            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[]p={1,3,2,8,4,9};
        System.out.println(maxProfit(p,2));
    }
}
