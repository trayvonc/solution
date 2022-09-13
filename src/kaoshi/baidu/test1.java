package kaoshi.baidu;

import java.util.ArrayList;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        if(str.length()<5){
            System.out.println(0);
            return;
        }
        char[] c=str.toCharArray();
        int left=0,right=0;
        int count=0;
        int res=0;
        int[] map=new int [128];
        while(right<c.length){
            char cR=c[right];
            map[cR]++;
            if(!isYuan(cR))count++;
            while(count>2||isYuan(c[left])||map[cR]>1){
                if(!isYuan(c[left]))count--;
                map[c[left]]--;
                left++;

            }
            if(right-left==4&&count==2&&!isYuan(c[left+3])){
                res++;
//                System.out.println(left+","+right);
            }
            right++;
        }
        System.out.println(res);
    }
    static boolean isYuan(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')return true;
        return false;
    }
    static boolean check(int[]a){
        for(int a1:a){
            if(a1>1)return false;
        }
        return true;
    }

}
