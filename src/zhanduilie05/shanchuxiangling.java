package zhanduilie05;

import java.util.Stack;

public class shanchuxiangling {
    public String removeDuplicates(String s) {
        Stack<Character> stack=new Stack<>();
        Stack<Character> stack1=new Stack<>();
        StringBuilder sb=new StringBuilder();
        char[] c=s.toCharArray();
        for(int i=0;i<c.length;i++){
            if(stack.isEmpty()||c[i]!=stack.peek())stack.push(c[i]);
            else stack.pop();
        }
        while(!stack.isEmpty()) stack1.push(stack.pop());
        while(!stack1.isEmpty()) sb.append(stack1.pop());
        return sb.toString();

    }

    public static void main(String[] args) {
        shanchuxiangling s=new shanchuxiangling();
        System.out.println(s.removeDuplicates("abbaac"));;
    }

}
