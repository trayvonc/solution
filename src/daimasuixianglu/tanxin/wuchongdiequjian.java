package daimasuixianglu.tanxin;

import java.lang.reflect.Array;
import java.util.Arrays;

public class wuchongdiequjian {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->{
            return a[1]-b[1];
        });//按照右区间升序
        int count=1;//无重复区间个数
        int rightBound=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]>=rightBound){//找到无重复端点，且必为它，下一个的右端点必大于它
                count++;
                rightBound=intervals[i][1];//更新右端点
            }
        }
        return intervals.length-count;

    }
}
