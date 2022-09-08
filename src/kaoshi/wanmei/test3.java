package kaoshi.wanmei;

import java.util.Arrays;
import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        int[][]time={{2,1,1},{2,3,1},{3,4,1}};
        System.out.println(networkDelayTime(time,4,2));

    }
    public static int networkDelayTime (int[][] times, int n, int k) {
        k=k-1;
        // write code here
        int[][] edge=new int [n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(edge[i],Integer.MAX_VALUE);
        }
        for(int i=0;i<times.length;i++){
//            Arrays.fill(edge[i],Integer.MAX_VALUE);
//            System.out.println(times[i][0]+","+times[i][1]);
            edge[times[i][0]-1][times[i][1]-1]=times[i][2];
        }
        for(int i=0;i<n;i++)edge[i][i]=0;
        int[]distance=new int[n];
        for(int j=0;j<n;j++){
            distance[j]=edge[k][j];
        }
        boolean flag[]=new boolean[n];
        flag[k]=true;
        minDistance(edge,distance,flag,k);
        int res=0;
        for(int j=1;j<n;j++){
            res=Math.max(res,distance[j]);
            if(distance[j]==Integer.MAX_VALUE)
                return -1;
        }
        for(int i:distance) System.out.println(i);
        return res;
    }
    public static void minDistance(int[][] graph,int[]distance,boolean[]flag,int k){
        while(true){
            int min=Integer.MAX_VALUE;
            int index=-1;
            for(int i=0;i<distance.length;i++){
                if(flag[i]==true)continue;
                if(distance[i]<min){
                    index=i;
                    min=distance[i];
                }
            }
            if(index==-1) break;//all in
            if(min==Integer.MAX_VALUE) break;//all in
            flag[index]=true;
            //用index判断最短路径
            for(int i=0;i<graph.length;i++){
                if(flag[i]==false&&graph[index][i]!=Integer.MAX_VALUE&&min+graph[index][i]<distance[i]){

                        distance[i]=min+graph[index][i];

                }
            }
        }
    }
}
