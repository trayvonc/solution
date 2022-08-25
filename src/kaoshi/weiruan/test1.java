package kaoshi.weiruan;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n==0){
            System.out.println("-1");
        }
        int res;
        if(n>0){
            res=Integer.MIN_VALUE;
            String str=String.valueOf(n);
//            int j=0;
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)=='5'){
                    String tmp;
                    if(i==0){
                        tmp=str.substring(1);
                    }else if(i==str.length()-1){
                        tmp=str.substring(0,i);
                    }else{
                        tmp=str.substring(0,i)+str.substring(i+1);
                    }
                    if(tmp.contains("5"))
                        res=Math.max(Integer.parseInt(tmp),res);
                }
            }
        }else{
            res=Integer.MAX_VALUE;
            String str=String.valueOf(0-n);
//            int j=0;
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)=='5'){
                    String tmp;
                    if(i==0){
                        tmp=str.substring(1);
                    }else if(i==str.length()-1){
                        tmp=str.substring(0,i);
                    }else{
                        tmp=str.substring(0,i)+str.substring(i+1);
                    }
                    if(tmp.contains("5"))
                        res=Math.min(Integer.parseInt(tmp),res);
                }
            }
        }
        if(res!=Integer.MIN_VALUE&&res!=Integer.MAX_VALUE){
            if(n>0)System.out.println(res);
            else System.out.println(0-res);
        }
        else{
            System.out.println("-1");
        }
    }
}
