package daimasuixianglu.zhanduilie05;

import java.util.ArrayDeque;
import java.util.Deque;
class myDeque {
    //形成递减队列
    Deque<Integer> deque=new ArrayDeque<>();
    //然后push，要保证压入元素之前都不比它大
    public void push(int val){
        while(!deque.isEmpty()&&val>deque.getLast()) deque.pollLast();
        deque.addLast(val);
    }
    //先pop，当要弹出元素等于队头时才需要弹出
    public void pop(int val){
        if(!deque.isEmpty()&&val==deque.getFirst()) deque.poll();
    }
    //最后获得队首，得到此时滑动窗口最大值
    public int peek(){
        return deque.getFirst();
    }
}
public class huadongchuangkou {
    myDeque deque=new myDeque();

    public int[] maxSlidingWindow(int[] nums, int k) {
        int len=nums.length-k+1;
        int[] res=new int[len];
        int count=0;
        for(int i=0;i<k;i++){
            deque.push(nums[i]);
        }
        res[count++]=deque.peek();
        for(int i=k;i<nums.length;i++){
            deque.pop(nums[i-k]);
            deque.push(nums[i]);
            res[count++]=deque.peek();
        }
        return res;
    }

    public static void main(String[] args) {
        huadongchuangkou s=new huadongchuangkou();
        int[] in={1,3,-1,-3,5,3,6,7};
        int[] res=s.maxSlidingWindow(in,3);
        for(int i:res) System.out.println(i);
    }


}
