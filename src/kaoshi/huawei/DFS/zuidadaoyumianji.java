package kaoshi.huawei.DFS;

public class zuidadaoyumianji {
    public static int maxAreaOfIsland(int[][] grid) {
        int maxR= grid.length,maxC=grid[0].length;
        int area=0,res=0;
        for(int r=0;r<maxR;r++){
            for(int c=0;c<maxC;c++){
                if(grid[r][c]==1){
                    area=area(grid,r,c);
                    res=Math.max(area,res);
                    //area return去掉 res++就可以得到岛屿数量
//                    res++;
                }

            }
        }
        return res;
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

    public static void main(String[] args) {
        int [][]grid={{0,0,1,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,1,1,0,1,0,0,0,0,0,0,0,0},{0,1,0,0,1,1,0,0,1,0,1,0,0},{0,1,0,0,1,1,0,0,1,1,1,0,0},{0,0,0,0,0,0,0,0,0,0,1,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,0,0,0,0,0,0,1,1,0,0,0,0}};
        int a=maxAreaOfIsland(grid);
        System.out.println(a);
    }
}
