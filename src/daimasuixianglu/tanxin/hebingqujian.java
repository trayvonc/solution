package daimasuixianglu.tanxin;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class hebingqujian {
    public int[][] merge(int[][] intervals) {
        List<int[]>res=new LinkedList<>();
        Arrays.sort(intervals,(a,b)->{
            return Integer.compare(a[0],b[0]);
        });
        int start=intervals[0][0];
        int rightMostBound=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]>rightMostBound){//当前左边界不在上一个区间右边界里
                res.add(new int[]{start,rightMostBound});
                start=intervals[i][0];//更新左边界
                rightMostBound=intervals[i][1];//更新右边界
            }else{
                rightMostBound=Math.max(rightMostBound,intervals[i][1]);
            }
        }
        res.add(new int[]{start,rightMostBound});//补充最后一个
        return res.toArray(new int[res.size()][]);
    }
}
