package kaoshi.huawei.DFS;

import java.util.Scanner;
//未被修改的像素面积
public class xiangsumianji {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int M=s.nextInt();int N=s.nextInt();
        int[][] graph=new int[M][N];
        for(int i=0;i<M;i++){
            for(int j=0;i<N;j++){
                graph[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<M;i++){
            for(int j=0;i<N;j++){
                int out=s.nextInt();
                if(out==graph[i][j]){
                    graph[i][j]=1;
                }
                else graph[i][j]=0;
            }
        }
        int area=0,res=0;
        for(int r=0;r<M;r++){
            for(int c=0;c<N;c++){
                if(graph[r][c]==1){
                    area=area(graph,r,c);
                    res=Math.max(area,res);
                }

            }
        }
        System.out.println(res);
    }
    static int area(int [][]grid,int r,int c){
        if(!inArea(grid,r,c)) return 0;
        if(grid[r][c]!=1)return 0;
        grid[r][c]=2;
        return 1+area(grid,r-1,c)
                +area(grid,r+1,c)
                +area(grid,r,c-1)
                +area(grid,r,c+1);

    }
    static boolean inArea(int [][]grid,int r,int c){
        return r>=0&&r<grid.length&&c>=0&&c<grid[0].length;
    }

}
