package kaoshi;

import java.util.Scanner;
//大疆笔试题，飞机飞过抓一个冷却1s
public class zhuadongxi {
    public static void test(){
        Scanner sc=new Scanner(System.in);
        String str="";
        if (sc.hasNextLine()){
            str=sc.nextLine();
        }
        String[] s=str.split(" ");
        int n=s.length;
        int[] values=new int [n];
        for(int i=0;i<s.length;i++){
            values[i]=Integer.parseInt(s[i]);
        }

        int [] dp=new int[n];

        if(n==1){
            System.out.println(values[0]);
            return;
        }else if(n==2){
            System.out.println(Math.max(values[0],values[1]));
            return;
        }
//        System.out.println(n);
        dp[0]=values[0];
        dp[1]=Math.max(values[0],values[1]);
        boolean get=true;
        int max=0;
        for(int i=2;i<=n-1;i++){

            for(int j=0;j<=i-2;j++){
                if(max<dp[j]) max=dp[j];
            }
            dp[i]=Math.max(max+values[i],dp[i-1]);

        }
        System.out.println(dp[n-1]);
    }
    public static void main(String[] args) {

    test();
    }
}
