package kaoshi.duxiaoman;

import java.util.ArrayList;
import java.util.Scanner;

public class test3 {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        for(int ii=0;ii<n;ii++){
            int len=s.nextInt();
            int p=s.nextInt();
            String str=s.next();
            int ans=0;
            for(int i=0;i<(p+1)/2;i++){//周期里每一个元素前半段
                int []count=new int[30];
                int maxx=0;
                for(int j=0;j<len;j+=p){//每一个周期起始位置
                    int left=i+j;//
                    int right=j+p-1-i;

                    if(left==right)count[str.charAt(left)-'a']++;
                    else{
                        count[str.charAt(left)-'a']++;
                        count[str.charAt(right)-'a']++;
                    }
                }
                for(int j=0;j<26;j++)maxx=Math.max(maxx,count[j]);//统计对应位置出现最多的次数,也就是不需要修改的次数
                ans+=maxx;

            }
            list.add(len-ans);
        }
        for(int a:list) System.out.println(a);

    }

}
