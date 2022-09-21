package kaoshi.meidi;

import java.util.Arrays;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine().toString();
        String[] arr=str.split(",");
        int[] list=new int[arr.length];
        for(int i=0;i< arr.length;i++){
            list[i]=Integer.parseInt(arr[i]);
        }
        Arrays.sort(list);
        int i=arr.length-2;
        for(;i>=0;i--){
            if(list[i]==list[list.length-1])continue;
            else break;
        }
        if(list[i]!=list[list.length-1]) System.out.println(list[i]*list[list.length-1]);
        else System.out.println(-1);
    }
}
