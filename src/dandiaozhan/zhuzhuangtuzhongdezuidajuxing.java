package dandiaozhan;

import java.util.Stack;

public class zhuzhuangtuzhongdezuidajuxing {
    public static int largestRectangleArea(int[] heights) {
        Stack<Integer> stack=new Stack<>();
        int res=0;
        stack.push(0);
        //左右扩容
        int[] newHeights=new int [heights.length+2];
        newHeights[0]=0;
        newHeights[newHeights.length-1]=0;
        for(int i=0;i<heights.length;i++){
            newHeights[i+1]=heights[i];
        }
        heights=newHeights;
        for(int i=1;i<heights.length;i++){
            if(heights[i]>heights[stack.peek()]){
                stack.push(i);
            }else if(heights[i]==heights[stack.peek()]){
                stack.pop();
                stack.push(i);
            }else{
                while(!stack.isEmpty()&&heights[i]<heights[stack.peek()]){
                    int mid=stack.peek();
                    stack.pop();
                    if(!stack.isEmpty()){
                        int left=stack.peek();
                        int height=heights[mid];
                        res=Math.max(res,height*(i-left-1));

                    }
                }
                stack.push(i);
            }

        }
        return res;
    }

    public static void main(String[] args) {
        int [] heights={2,1,5,6,2,3};
        System.out.println(largestRectangleArea(heights));
    }
}
