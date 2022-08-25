package kaoshi.weiruan;

import java.util.HashMap;
import java.util.HashSet;

public class test2 {
    public static int solution(int[] A) {
        // write your code in Java 11 (Java SE 11)
        Long res=new Long(0);
        int[]sum=new int[A.length];
        if(A.length==0)return A[0]==0?1:0;
        sum[0]=A[0];
        HashMap<Integer,Long> map=new HashMap<>();
        for(int i=1;i<A.length;i++){
            sum[i]+=sum[i-1]+A[i];
            if(sum[i]==0){
                res++;
                res+=map.getOrDefault(sum[i],Long.valueOf(0));
            }else if(map.containsKey(sum[i])){
                res+=map.getOrDefault(sum[i],Long.valueOf(0));
            }
            map.put(sum[i],map.getOrDefault(sum[i],Long.valueOf(0))+1);
        }
        return res<1000000000?res.intValue():-1;
    }

    public static void main(String[] args) {
        int[] A={2,-2,3,0,4,-7};
        System.out.println(solution(A));
    }
}
