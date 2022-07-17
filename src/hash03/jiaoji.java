package hash03;

import java.util.HashSet;

public class jiaoji {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> resSet=new HashSet<>();
        //没有确定范围，只能用set来做交集判断
        for(int i:nums1){
            set.add(i);
        }
        for(int i:nums2){
            if(set.contains(i)){
                resSet.add(i);
            }
        }
        //重新赋值
        int[] res=new int[resSet.size()];
        int index=0;
        for(int i:resSet){
            res[index++]=i;
        }
        return res;
    }
}
