package kaoshi.san360;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Long n=s.nextLong();
        int q=s.nextInt();
        Map<Long,Integer> pan=new HashMap<>();
        for(Long i=0l;i<n;i++){
            pan.put(i,0);
        }
        Long []res=new Long[q];
        Long hei=n;
        for(int i=0;i<q;i++){
            Long start=s.nextLong()-1;
            Long end=s.nextLong()-1;
            for(Long j=start;j<=end;j++){
                if(pan.get(j)==0){
//                    pan[j.intValue()]=1;
                    hei--;
                    pan.put(j,1);
                }
                else{
                    pan.put(j,0);
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
