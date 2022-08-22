package daimasuixianglu.dandiaozhan;

import java.util.Arrays;
import java.util.Stack;

public class xiayigegengdadeyuansu2 {
    public int[] nextGreaterElements(int[] nums) {
        int[] result=new int[nums.length];
        Stack<Integer> stack=new Stack<>();
        stack.push(0);
        Arrays.fill(result,-1);
        for(int i=1;i<nums.length*2;i++){
            while(!stack.isEmpty()&&nums[i%nums.length]>nums[stack.peek()]){
                result[stack.peek()]=nums[i%nums.length];
                stack.pop();
            }
            stack.push(i%nums.length);
        }
        return result;
    }
}
