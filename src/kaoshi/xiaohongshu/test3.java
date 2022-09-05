package kaoshi.xiaohongshu;

import java.util.Arrays;
import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();//city
        int m=s.nextInt();//road
        int k=s.nextInt();//len
        int []from=new int[m];
        int []to=new int[m];
        int []cost=new int[m];
        int[][] edge=new int [m][m];
        for(int i=0;i<m;i++)from[i]=s.nextInt()-1;
        for(int i=0;i<m;i++)to[i]=s.nextInt()-1;
        for(int i=0;i<m;i++)cost[i]=s.nextInt();
        for(int i=0;i<m;i++){
            Arrays.fill(edge[i],Integer.MAX_VALUE);
            edge[from[i]][to[i]]=cost[i];
            edge[to[i]][from[i]]=cost[i];
            edge[i][i]=0;
        }
        Arrays.sort(cost);
        int minCost=cost[0];
        int maxCost=cost[cost.length-1];
        int res=maxCost;
        for(int i=minCost;i<=maxCost;i++){
            //以i为通信证，最短距离包含节点n
            boolean flag[]=new boolean[n];
            flag[0]=true;
            int[]distance=new int[n];
            for(int j=1;j<n;j++){
                if(edge[0][j]<=i)
                    distance[j]=1;
                else
                    distance[j]=Integer.MAX_VALUE;
            }
            if(distance[n-1]<=k)break;
            minDistance(edge,distance,flag,i);
            if(distance[n-1]<=k){
                res=i;
                break;
            }
        }
        System.out.println(res);

    }
    public static void minDistance(int[][] graph,int[]distance,boolean[]flag,int zheng){
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
            flag[index]=true;
            //用index判断最短路径
            for(int i=0;i<graph.length;i++){
                if(graph[index][i]<=zheng){
                    if(distance[i]>=min+1){
                        distance[i]=min+1;
                    }
                }
            }
        }
    }
}
