package daimasuixianglu.hash03;

import java.util.HashMap;

public class liangshuzhihe {
    public int[] twoSum(int[] nums, int target) {
        int[] res=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            //找delta是否在map中，返回下标
            int delta=target-nums[i];
            if(map.containsKey(delta)){
                res[0]=i;
                res[1]=map.get(delta);
                break;
            }
            map.put(nums[i],i);
        }
        return res;
    }
}
