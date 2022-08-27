package kaoshi.jd;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int aa=s.nextInt();
        int max=0;
        int x=aa-6;
        int res=0;
        for(int a=0;a<=x;a++){
            for(int b=0;b<=x;b++){
                int c=x-a-b;
                if(c>=0&&c<=x){
                    max++;
                    System.out.println(a+","+b+","+c);
                    res+=Math.pow(26,a)+Math.pow(26,b)+Math.pow(26,c);
                }
            }
        }
        System.out.println((res)%(1000000007));
    }
}
