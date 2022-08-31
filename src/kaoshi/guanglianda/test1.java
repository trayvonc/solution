package kaoshi.guanglianda;

import java.util.HashMap;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int [] begin=new int[n];
        int [] finish=new int[n];
        HashMap <Integer,Integer> bemap=new HashMap<>();
        HashMap <Integer,Integer> fimap=new HashMap<>();
        for(int i=0;i<n;i++){
            begin[i]=s.nextInt();
            bemap.put(begin[i],i);
        }
        for(int i=0;i<n;i++){
            finish[i]=s.nextInt();
            fimap.put(finish[i],i);
        }
        int res=0;
        for(int i=0;i<n;i++){
            int cur=begin[i];
            int fiCur=fimap.get(cur);
            for(int j=0;j<i;j++){
                if(fimap.get(begin[j])>fiCur){
                    res++;
                    break;
                }
            }
        }
        System.out.println(res);

    }
}
