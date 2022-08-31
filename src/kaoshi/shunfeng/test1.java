package kaoshi.shunfeng;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class test1 {

//    List<List<Integer>> res=new ArrayList<>();
    static LinkedList<Integer> path=new LinkedList<>();

    static public int res=0;

    static void dfs(int k,int n,boolean[] used){
        if(k==n){
            res++;
            return;
        }
        for(int i=1;i<=n;i++){
            if(!used[i]){
                path.add(i);
                used[i]=true;
                dfs(k+1,n,used);
                used[i]=false;
                path.removeLast();
            }
        }

    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        boolean[] used=new boolean[n+1];
        dfs(1,n,used);
        System.out.println(res);
    }

}
