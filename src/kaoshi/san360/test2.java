package kaoshi.san360;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Long n=s.nextLong();
        int q=s.nextInt();
        int [] pan=new int[n.intValue()];
        Long []res=new Long[q];
        Long hei=n;
        for(int i=0;i<q;i++){
            Long start=s.nextLong()-1;
            Long end=s.nextLong()-1;
            for(Long j=start;j<=end;j++){
                if(pan[j.intValue()]==0){
                    pan[j.intValue()]=1;
                    hei--;
                }
                else{
                    pan[j.intValue()]=0;
                    hei++;
                }
            }
            res[i]=hei;
        }
        for(Long i:res){
            System.out.println(i);
        }

    }
}
