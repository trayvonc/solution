package kaoshi.meituan;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class defen {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int[]p=new int[n];
        int[]a=new int[n];
        for(int i=0;i<n;i++)p[i]=in.nextInt();
        for(int i=0;i<n;i++)a[i]=in.nextInt();
        double res=0;
        for(int i=0;i<n;i++){
            res+=p[i]*a[i];
        }
        double max=0;int index=0;
        Set<Integer> set=new HashSet<>();
        while(m>0){
            for(int i=0;i<n;i++){
//                System.out.println(i);
//                System.out.println(res-p[i]*a[i]+100*a[i]);
                if(res-p[i]*a[i]+100*a[i]>max&&!set.contains(i)){
                    max=res-p[i]*a[i]+100*a[i];
                    index=i;
//                    res=max;
                }
            }
            set.add(index);
            m--;
        }
        Iterator<Integer> it=set.iterator();
        while(it.hasNext()){
            int tmp=it.next().intValue();
            res=res-p[tmp]*a[tmp]+100*a[tmp];
        }
        System.out.println(res/100);

    }
}
