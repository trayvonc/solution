package kaoshi.jd;

import java.util.*;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n==1){
            System.out.println(0);
            return;
        }

        int[] list=new int[n];
//        int[] res={0,0};
        HashMap <Integer,Integer> map1=new HashMap<>();
        HashMap <Integer,Integer> map2=new HashMap<>();
        for(int i=0;i<n;i++){
            list[i]=s.nextInt();
            if(i%2==0) map1.put(list[i],map1.getOrDefault(list[i],0)+1);
            else map2.put(list[i],map2.getOrDefault(list[i],0)+1);
        }
        Iterator<Map.Entry<Integer,Integer>> entryIterator1=map1.entrySet().iterator();
        Iterator<Map.Entry<Integer,Integer>> entryIterator2=map2.entrySet().iterator();
        int count1=0;
        int count2=0;
        int res1=0;
        while(entryIterator1.hasNext()){
            Map.Entry<Integer,Integer> entry=entryIterator1.next();
//            count1=Math.max(count1,entry.getValue());
            int val1=entry.getValue();
            while(entryIterator2.hasNext()){
                Map.Entry<Integer,Integer> entry1=entryIterator2.next();
                if(!entry.getKey().equals(entry1.getKey())){
                    int val2=entry1.getValue();
                    res1=Math.max(res1,val1+val2);
                }
//                    count2=Math.max(count2,entry1.getValue());

            }
        }


        System.out.println(n-res1);
//        List<Integer>[] b=new ArrayList[n];
//        for(int key:map1.keySet()){
//            int fre= map1.get(key);
//            if(b[fre]==null){
//                b[fre]=new ArrayList<>();
//            }
//            b[fre].add(key);
//        }
//        List<Integer>[] c=new ArrayList[n];
//        for(int key:map2.keySet()){
//            int fre= map2.get(key);
//            if(c[fre]==null){
//                c[fre]=new ArrayList<>();
//            }
//            c[fre].add(key);
//        }
//        int need=0;
//        for(int i=b.length-1;i>=0;i--){
//            if(b[i]==null){
//                continue;
//            }else{
//                int max=b[i].get(0);
//                for(int j=c.length-1;j>=0;j--){
//                    if(c[i]==null){
//                        continue;
//                    }else {
//                        int max1=c[i].get(0);
//                        if(max!=max1){
//                            need=Math.max(i+j,need);
//                        }
//                    }
//                }
//
//            }
//
//        }
//        System.out.println(n-need);


    }
}
