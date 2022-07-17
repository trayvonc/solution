package hash03;

import java.util.HashMap;

public class sishuxiangjia {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        //两层，统计i+j出现的次数
        for(int i:nums1){
            for(int j:nums2){
                if(map.containsKey(i+j)){
                    map.put(i+j,map.get(i+j)+1);
                }
                else{
                    map.put(i+j,1);
                }
            }
        }
        //两层，总数加上0-(i+j)出现的次数
        for(int i:nums3){
            for(int j:nums4){
                if(map.containsKey(0-(i+j))){
                    count+=map.get(0-(i+j));
                }
            }
        }
        return count;


    }
    public static void main(String[] args) {
        sishuxiangjia s=new sishuxiangjia();
        int [] a={1,2};
        int [] a1={-2,-1};
        int [] a2={-1,2};
        int [] a3={0,2};
        System.out.println(s.fourSumCount(a,a1,a2,a3));
    }
}
