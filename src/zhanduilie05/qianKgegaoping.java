package zhanduilie05;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class qianKgegaoping {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res=new int[k];
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        // 用map存储频率
        for(int num:nums) hashMap.put(num,hashMap.getOrDefault(num,0)+1);
        //定义遍历对象
        Set<Map.Entry<Integer,Integer>> entries=hashMap.entrySet();
        //定义一个小顶堆
        PriorityQueue<Map.Entry<Integer,Integer>> queue=new PriorityQueue<>((v1,v2)->v1.getValue()-v2.getValue());
        for(Map.Entry<Integer,Integer> entry:entries){
            queue.offer(entry);//offer不抛出异常
            if(queue.size()>k) queue.poll();
        }
        for(int i=k-1;i>=0;i--){
            res[i]=queue.poll().getKey();
        }
        return res;
    }

    public static void main(String[] args) {
        qianKgegaoping s=new qianKgegaoping();
        int[] in={1,1,1,2,2,3};
        int[] res=s.topKFrequent(in,2);
        for(int i:res) System.out.println(i);
    }
}
