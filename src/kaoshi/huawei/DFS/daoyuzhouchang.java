package kaoshi.huawei.DFS;

public class daoyuzhouchang {
    public static int islandPerimeter(int[][] grid) {
        int maxR= grid.length,maxC=grid[0].length;
        for(int r=0;r<maxR;r++){
            for(int c=0;c<maxC;c++){
                if(grid[r][c]==1){
                    return dfs(grid,r,c);
                }

            }
        }
        return  0;
    }
    static int dfs(int [][]grid,int r,int c){
        if(!inArea(grid,r,c)) return 1;
        if(grid[r][c]==0)return 1;
        if(grid[r][c]==2)return 0;
        grid[r][c]=2;
        return dfs(grid,r-1,c)
                +dfs(grid,r+1,c)
                +dfs(grid,r,c-1)
                +dfs(grid,r,c+1);

    }
    static boolean inArea(int [][]grid,int r,int c){
        return r>=0&&r<grid.length&&c>=0&&c<grid[0].length;
    }

    public static void main(String[] args) {
        int[][]grid={{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        System.out.println(islandPerimeter(grid));
    }
}
