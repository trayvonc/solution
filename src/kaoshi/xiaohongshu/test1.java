package kaoshi.xiaohongshu;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int k=s.nextInt();
        int[] num=new int[n];
        for(int i=0;i<n;i++) num[i]=s.nextInt();
        if(k==0){
            System.out.println(num[0]);
            return;
        }
        int zu=(k-1)/n;
        int index=(k-1)%n;
        if(zu%2==0){
            System.out.println(num[index]);
        }else{
            System.out.println(num[num.length-1-index]);
        }
    }
}
