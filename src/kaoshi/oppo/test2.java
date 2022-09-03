package kaoshi.oppo;

public class test2 {
    static long res=0;
    public static long tourismRoutePlanning (int scenicspot) {
        // write code here
        dfs(0,scenicspot);
        return res;
    }
    public static void dfs(int sum,int n){
        if(sum>n)return;
        if(sum==n)res++;
        for(int i=1;i<=2;i++){
            dfs(sum+i,n);
        }
    }

    public static void main(String[] args) {
        tourismRoutePlanning(4);
        System.out.println(res);
    }
}
