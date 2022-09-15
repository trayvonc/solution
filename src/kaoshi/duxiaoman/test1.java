package kaoshi.duxiaoman;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int res=0;
        for(int i=0;i<n;i++){
            HashMap<Character,Integer> map=new HashMap<>();
            String str=s.next();
            char[] c=str.toCharArray();
            int max=0;
            int min=c.length;
            for(char c1:c){
                map.put(c1,map.getOrDefault(c1,0)+1);

            }
            for(Map.Entry<Character,Integer> entry:map.entrySet()){
                max=Math.max(max,entry.getValue());
                min=Math.min(min,entry.getValue());
            }

            res=Math.max(max-min,res);
        }
        System.out.println(res);
    }
}
