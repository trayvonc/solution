package zhanduilie05;

import java.util.Stack;

public class nobolanqiuzhi {
    public int evalRPN(String[] tokens) {
        Stack<String> stack=new Stack<>();
        String a,b;
        for(String s:tokens){
            if(isFuhao(s)){
               b=stack.pop();
               a=stack.pop();
               stack.push(option(a,b,s));
            }
            else {
                stack.push(s);
            }
        }
        return Integer.valueOf(stack.pop());
    }
    public boolean isFuhao(String s){
        if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/")) return true;
        else return false;
    }
    public String option(String a,String b,String op){
        switch (op){
            case "+":
                return String.valueOf(Integer.valueOf(a)+Integer.valueOf(b));

            case "-":
                return String.valueOf(Integer.valueOf(a)-Integer.valueOf(b));

            case "*":
                return String.valueOf(Integer.valueOf(a)*Integer.valueOf(b));

            case "/":
                return String.valueOf(Integer.valueOf(a)/Integer.valueOf(b));


        }
        return "bad";
    }

    public static void main(String[] args) {
        nobolanqiuzhi s=new nobolanqiuzhi();
        String[] tokens={"2","1","+","3","*"};
        System.out.println(s.evalRPN(tokens));
    }
}
