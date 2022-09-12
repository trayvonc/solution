package kaoshi.san360;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        Integer []num=new Integer[n];
        for(int i=0;i<n;i++) num[i]=s.nextInt();
        for(int i=0;i<m;i++){
            int t=s.nextInt();
            int index=s.nextInt();
            if(t==0){
                Arrays.sort(num,0,index);
            }else{

                Arrays.sort(num, 0, index, new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o2-o1;
                    }
                });
            }
        }
        for(int i:num){
            System.out.print(i+" ");
        }

    }


}

