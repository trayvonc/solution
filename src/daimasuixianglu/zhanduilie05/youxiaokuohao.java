package daimasuixianglu.zhanduilie05;

import java.util.Stack;

public class youxiaokuohao {
    public boolean isValid(String s) {
        Stack<Character> stack1=new Stack<>();
        char[]c=s.toCharArray();
        if(c.length==0) return true;
        if(c.length%2!=0) return false;
        for(int i=0;i<c.length;i++){
            //push对应的，然后抵消
            if(c[i]=='(') stack1.push(')');
            else if(c[i]=='[') stack1.push(']');
            else if (c[i]=='{') stack1.push('}');
            else if(stack1.isEmpty()||stack1.peek()!=c[i]) return false;
            else stack1.pop();
        }
        return stack1.isEmpty();
    }

    public static void main(String[] args) {
        youxiaokuohao s=new youxiaokuohao();
        System.out.println(s.isValid("[{}]("));
    }

}
