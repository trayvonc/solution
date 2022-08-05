package dandiaozhan;

import java.util.Stack;

public class jieyushui {
    public int trap(int[] height) {
        Stack<Integer> stack=new Stack<>();
        stack.push(0);
        int sum=0;
        for (int i=1;i<height.length;i++){
            if(!stack.isEmpty()&&height[i]<height[stack.peek()]){
                stack.push(i);
            }
            else if(!stack.isEmpty()&&height[i]==height[stack.peek()]){
                stack.pop();
                stack.push(i);
            }else{
                //要保证单调栈内部（从头到尾升序）入栈前要把所有栈顶元素弹出
                while(!stack.isEmpty()&&height[i]>height[stack.peek()]){
                    int mid=stack.peek();
                    stack.pop();
                    if(!stack.isEmpty()) {
                        int h = Math.min(height[stack.peek()], height[i]) - height[mid];
                        int w = i - stack.peek() - 1;
                        sum += h * w;
                    }
                }
                stack.push(i);
            }

        }
        return sum;
    }
}
