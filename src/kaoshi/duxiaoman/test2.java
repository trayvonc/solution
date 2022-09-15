package kaoshi.duxiaoman;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int h=sc.nextInt();
        int [][] lu=new int[N][2];
        int min=Integer.MAX_VALUE,max=-1;
//        for(int i=0;i<N;i++){
//            lu[i][0]=sc.nextInt();
//            lu[i][1]=sc.nextInt();
//            min=Math.min(min,lu[i][0]);
//            max=Math.max(max,lu[i][1]);
//        }
//        int res=0;
//        int []xueLu=new int[max-min+1];
//        for(int i=0;i<N;i++){
//            for(int j=lu[i][0];j<lu[i][1];j++){
//                xueLu[j-min]++;
//
//            }
//        }
//        for(int i=0;i<xueLu.length;i++){
//            if(xueLu[i]>=h)res++;
//        }
//        System.out.println(res);
        for(int i=0;i<N;i++){
            lu[i][0]=sc.nextInt();
            lu[i][1]=sc.nextInt();
            min=Math.min(min,lu[i][0]);
            max=Math.max(max,lu[i][1]);
        }
        int res=0;
//        int []xueLu=new int[max-min+1];
//        for(int i=0;i<N;i++){
//            for(int j=lu[i][0];j<lu[i][1];j++){
//                xueLu[j-min]++;
//
//            }
//        }
        for(int i=min;i<max;i++){
            int count=0;
            for(int j=0;j<N;j++){
                if(i>=lu[j][0]&&i<lu[j][1]){
                    count++;
                    if(count>=h){
                        res++;
                        break;
                    }
                }
            }
        }
//        for(int i=0;i<xueLu.length;i++){
//            if(xueLu[i]>=h)res++;
//        }
        System.out.println(res);
    }
}
