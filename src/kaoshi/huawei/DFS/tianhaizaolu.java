package kaoshi.huawei.DFS;

import java.util.*;

public class tianhaizaolu {

    public static int largestIsland(int[][] grid) {
        int maxR= grid.length,maxC=grid[0].length;
        HashMap<Integer,Integer> map=new HashMap<>();
        int area,change=2;
        boolean hasZero=false;
        for(int r=0;r<maxR;r++){
            for(int c=0;c<maxC;c++){
                if(grid[r][c]==1){
                    area=area(grid,r,c,change);
                    map.put(change,area);
                    change++;
                }else if(grid[r][c]==0){
                    hasZero=true;
                }
            }
        }
        if(!hasZero) return maxC*maxR;
        return tianhai(grid,map);

    }
    static int area(int [][]grid,int r,int c,int change){
        if(!inArea(grid,r,c)) return 0;
        if(grid[r][c]!=1)return 0;
        grid[r][c]=change;
        return 1+area(grid,r-1,c,change)
                +area(grid,r+1,c,change)
                +area(grid,r,c-1,change)
                +area(grid,r,c+1,change);

    }

    static boolean inArea(int [][]grid,int r,int c){
        return r>=0&&r<grid.length&&c>=0&&c<grid[0].length;
    }

    public static int tianhai(int[][] grid,HashMap<Integer,Integer> map) {
        int maxR= grid.length,maxC=grid[0].length;
        int maxArea=0;
        for(int r=0;r<maxR;r++){
            for(int c=0;c<maxC;c++){
                if(grid[r][c]==0){
                    int adj=adj(grid,r,c,map);
                    maxArea=Math.max(maxArea,adj);

                }
            }
        }
        return maxArea;
    }
    static int adj(int [][]grid,int r,int c,HashMap<Integer,Integer> map){
        Set<Integer> set=new HashSet<>();
        if(r-1>=0)set.add(grid[r-1][c]);
        if(r+1<grid.length)set.add(grid[r+1][c]);
        if(c-1>=0)set.add(grid[r][c-1]);
        if(c+1<grid[0].length)set.add(grid[r][c+1]);
        int sum=0;
        for(int i:set){
            sum+=map.getOrDefault(i,0);
        }
        return sum+1;

    }


    public static void main(String[] args) {
        int [][]grid={{0,0,1,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,1,1,0,1,0,0,0,0,0,0,0,0},{0,1,0,0,1,1,0,0,1,0,1,0,0},{0,1,0,0,1,1,0,0,1,1,1,0,0},{0,0,0,0,0,0,0,0,0,0,1,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,0,0,0,0,0,0,1,1,0,0,0,0}};
        int a=largestIsland(grid);
        System.out.println(a);
//        for(int i=0;i<res.size();i++) System.out.println(res.get(i));
    }
}
