package kaoshi.huawei.DFS;

public class daoyushuliang {
    public static int numIslands(int[][] grid) {
        int maxR=grid.length,maxC=grid[0].length;
        int res=0;
        for(int r=0;r<maxR;r++){
            for(int c=0;c<maxC;c++){
                if(grid[r][c]==1){
                    dfs(grid,r,c);
                    res++;
                }

            }
        }
        return res;
    }
    static void dfs(int [][]grid,int r,int c){
        if(!inArea(grid,r,c)) return;
        if(grid[r][c]!=1) return;
        grid[r][c]=2;
        dfs(grid,r-1,c);
        dfs(grid,r+1,c);
        dfs(grid,r,c-1);
        dfs(grid,r,c+1);
    }
    static boolean inArea(int [][]grid,int r,int c){
        return r>=0&&r<grid.length&&c>=0&&c<grid[0].length;
    }

    public static void main(String[] args) {
        int [][]grid={{0,0,1,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,1,1,0,1,0,0,0,0,0,0,0,0},{0,1,0,0,1,1,0,0,1,0,1,0,0},{0,1,0,0,1,1,0,0,1,1,1,0,0},{0,0,0,0,0,0,0,0,0,0,1,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,0,0,0,0,0,0,1,1,0,0,0,0}};
        int a=numIslands(grid);
        System.out.println(a);
    }
}
