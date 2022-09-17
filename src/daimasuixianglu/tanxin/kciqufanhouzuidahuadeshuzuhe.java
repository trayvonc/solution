package daimasuixianglu.tanxin;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class kciqufanhouzuidahuadeshuzuhe {
    public int largestSumAfterKNegations(int[] nums, int k) {
        nums= Arrays.stream(nums).boxed()
                .sorted((o1,o2)->Math.abs(o2)-Math.abs(o1))
                .mapToInt(Integer::intValue).toArray();//按绝对值降序排序
//        nums= IntStream.of(nums).boxed()
//                .sorted((o1,o2)->Math.abs(o2)-Math.abs(o1))
//                .mapToInt(Integer::intValue).toArray();//按绝对值降序排序
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0&&k>0){
                k--;
                nums[i]=-nums[i];
            }
        }
        if(k%2==1){

                    nums[nums.length-1]=-nums[nums.length-1];


        }
        return Arrays.stream(nums).sum();

    }
}
