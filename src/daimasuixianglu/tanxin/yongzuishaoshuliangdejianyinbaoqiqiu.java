package daimasuixianglu.tanxin;

import java.util.Arrays;

public class yongzuishaoshuliangdejianyinbaoqiqiu {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->{//按照左边界升序排序
            return Integer.compare(a[0],b[0]);
        });
        int count=1;
        int leftMostRightBound=points[0][1];
        for(int i=1;i<points.length;i++){
            if(points[i][0]>leftMostRightBound){//如果左边界超出最近右边界
                count++;//加一只箭
                leftMostRightBound=points[i][1];//下一个边界
            }else{//重叠了，更新边界
                leftMostRightBound=Math.min(leftMostRightBound,points[i][1]);
            }
        }
        return count;
    }
}
