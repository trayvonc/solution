package daimasuixianglu.tanxin;

public class jiayouzhan {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int curSum=0,totalSum=0,start=0;
        for(int i=0;i<gas.length;i++){
            curSum+=(gas[i]-cost[i]);
            totalSum+=(gas[i]-cost[i]);
            if(curSum<0){//如果当前和小于0，则不能从i及之前出发
                start=(i+1)%gas.length;//此处因为保证了油够用前提
                curSum=0;
            }
        }
        if(totalSum<0)return -1;//gas综合比cost小，走不完
        return start;
    }
}
