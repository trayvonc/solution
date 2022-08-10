package test;

import java.util.Arrays;

public class zhuanhuan {
    public static void main(String[] args) {
        String s="2 3 4 6 1";
        String [] str=s.split(" ");
        int[] myint=new int[str.length];
        int index=0;
        for(String s1:str){
            myint[index++]=Integer.parseInt(s1);
        }
        Arrays.sort(myint);
        for(int i:myint){
            System.out.println(i);
        }

    }
}
