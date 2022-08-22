package kaoshi.wangyi;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();int[]b=new int[a];
        for(int i=0;i<a;i++) b[i]=in.nextInt();
        int left=0,right=0;
//        while(right<a){
//            while(b[left]!=b[right]&&left<right){
//                left++;
//            }
//            if(left!=right){
//
//            }
//        }
        int sum=0;
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                if(b[i]==b[j]){
                    for(int k=i;k<j;k++){
                        if(b[i]>b[k])sum++;
                    }
                }
            }
        }
        System.out.println(sum);
    }

}
