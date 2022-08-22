package daimasuixianglu.tanxin;

import java.util.Arrays;

public class fenfabinggan {//排序，用最大的满足最大的
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int j=s.length-1;//饼干下标
        int res=0;
        //遍历孩子
        for(int i=g.length-1;i>=0;i--){
            if(j>=0&&s[j]>=g[i]){//还有饼干可以分配，且大于
                res++;
                j--;
            }
        }
        return res;
    }
}
