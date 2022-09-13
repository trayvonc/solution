package kaoshi.baidu;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[]nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=s.nextInt();
        }
        int count=0;
        if(n<=2){
            for(int i:nums)count+=i;
            System.out.println(count);
            return;
        }
        for(int i=0;i<n;i++){
            while(i<=nums.length-3&&nums[i]>=1&&nums[i+1]>=2&&nums[i+2]>=3){
                nums[i]=nums[i]-1;
                nums[i+1]=nums[i+1]-2;
                nums[i+2]=nums[i+2]-3;
                count+=5;
            }
        }
        for(int i:nums)count+=i;
        System.out.println(count);
    }
}
