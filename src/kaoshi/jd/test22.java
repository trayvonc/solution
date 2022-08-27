package kaoshi.jd;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class test22 {
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
        int text1=0;
        int text2=0;
        while(entryIterator1.hasNext()){
            Map.Entry<Integer,Integer> entry=entryIterator1.next();
            if(entry.getValue()>count1) text1=entry.getKey();
            count1=Math.max(count1,entry.getValue());

        }
        while(entryIterator2.hasNext()){
            Map.Entry<Integer,Integer> entry=entryIterator2.next();
            if(entry.getValue()>count1) text2=entry.getKey();
            count2=Math.max(count2,entry.getValue());
        }
        if(text1==text2){
            System.out.println(n-count1);
            return;
        }
        System.out.println(n-count1-count2);

    }
}
