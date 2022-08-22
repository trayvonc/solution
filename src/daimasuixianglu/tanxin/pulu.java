package daimasuixianglu.tanxin;

import java.util.Scanner;
/*
春春是一名道路工程师，负责铺设一条长度为 n 的道路。

铺设道路的主要工作是填平下陷的地表。整段道路可以看作是 n 块首尾相连的区域，一开始，第 i 块区域下陷的深度为 d_i 。

春春每天可以选择一段连续区间[L,R] ，填充这段区间中的每块区域，让其下陷深度减少 1。在选择区间时，需要保证，区间内的每块区域在填充前下陷深度均不为 0 。

春春希望你能帮他设计一种方案，可以在最短的时间内将整段道路的下陷深度都变为 0 。
 */
public class pulu {
    public static void main(String[] args) {
//        String a="abc";
//        StringBuffer sb=new StringBuffer(a);
//        System.out.println(sb.reverse().toString());
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int [] lu=new int[N];
        for(int i=0;i<N;i++){
            lu[i]=sc.nextInt();
        }
        int []dp=new int[N];
        dp[0]=lu[0];
        for(int i=1;i<N;i++){
            if(lu[i]>lu[i-1]){
                dp[i]=dp[i-1]+lu[i]-lu[i-1];
            }else{
                dp[i]=dp[i-1];
            }
        }
        System.out.println(dp[N-1]);
    }
}
