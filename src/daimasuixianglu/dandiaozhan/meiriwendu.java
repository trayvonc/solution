package daimasuixianglu.dandiaozhan;

import java.util.Stack;

public class meiriwendu {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack=new Stack<>();
        int[] ans=new int[temperatures.length];
        stack.push(0);
        for(int i=1;i<temperatures.length;i++){
            //依次和栈顶比较，由于要找到第一个比自己大的，所以要从顶到底部升序，顶部最小
            while(!stack.isEmpty()&&temperatures[i]>temperatures[stack.peek()]){//栈不空，且大于，说明找到一第一个比我大的了
                ans[stack.peek()]=i-stack.peek();
                stack.pop();
            }
            stack.push(i);//如果小于等于，直接入栈

        }
        return ans;
    }
}
