package kaoshi.shunfeng;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if(n==1){
            System.out.println(1);
            return;
        }else if(n==2){
            System.out.println(2);
            return;
        }
        else if(n==3){
            System.out.println(2);
            return;
        }
        int res=0;
        while(n>1){
            res+=(n/2)+1;
            n--;
        }
        res+=1;
        System.out.println(res);
    }

}
