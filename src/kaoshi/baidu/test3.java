package kaoshi.baidu;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class test3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Stack stack=new Stack();
        int size=0,ans=0;
        ArrayList<Integer> all=new ArrayList<>();
        ArrayList<Integer> type=new ArrayList<>();
        int len=0;
        String str="";
        while(len<3||(s.hasNextLine()&& !(str = s.nextLine()).equals("}"))){
            len++;
            if(len<3)str=s.nextLine();
            if(str.contains("for")){
                stack.push('{');
                size++;
                ans=Math.max(size,ans);
            }
            if(str.contains("if")||str.contains("Main")||str.contains("void main")){
                stack.push('a');
            }
            if(str.contains("}")){
                if(stack.peek().equals('a')){
                    stack.pop();
                }else{
                    size--;
                    stack.pop();
                }
            }
//            if(str.contains("{")){
//                res++;
//                all.add(res);
//                if(str.contains("for")){
//                    type.add(0);
//                }else{
//                    type.add(1);
//                }
//            }
        }
        System.out.println(ans);
    }
}
