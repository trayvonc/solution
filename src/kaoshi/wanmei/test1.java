package kaoshi.wanmei;

public class test1 {
    public int maximumTotal (int[][] triangle) {
        // write code here
        int res=dfs(triangle,0,0);
        return res;
    }
    public int dfs(int[][] triangle,int i,int j){
        if(i==triangle.length)return 0;
        int left=dfs(triangle,i+1,j);
        int right=dfs(triangle,i+1,j+1);
        return triangle[i][j]+Math.max(left,right);
    }
}
