package daimasuixianglu.tanxin;

import java.util.Arrays;
import java.util.LinkedList;

public class gengjushenggaochongjianduilie {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people,(a,b)->{//按身高降序，相同则按k升序，方便后面插入
            if(a[0]==b[0]) return a[1]-b[1];
            return b[0]-a[0];
        });
        LinkedList<int[]> res=new LinkedList<>();
        for(int [] ren:people){//插入的时候直接按下标，因为已经是身高降序的了
            int k=ren[1];
            res.add(k,ren);
        }
        return res.toArray(new int[people.length][2]);
    }
}
