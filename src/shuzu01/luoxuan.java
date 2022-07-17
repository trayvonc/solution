package shuzu01;

public class luoxuan {
    public int[][] func(int  n){
        int[][]res=new int[n][n];
        int loop=n/2;
        int startx=0,starty=0;
        int mid=n/2,offset=1;
        int count=1;
        while(loop>0){
            int i=startx;
            int j=starty;
            for(;j<starty+n-offset;j++){
                res[startx][j]=count++;
            }
            for(;i<startx+n-offset;i++){
                res[i][j]=count++;
            }
            for(;j>starty;j--){
                res[i][j]=count++;
            }
            for(;i>startx;i--){
                res[i][j]=count++;
            }
            loop--;
            startx+=1;
            starty+=1;
            offset+=2;
        }
        if(n%2==1){
            res[mid][mid]=count;
        }
        return res;
    }
    public static void main(String[] args){
        luoxuan s=new luoxuan();
//        int[] a={2,3,1,2,4,3};
       int[][] res= s.func(3);
        for(int[] a:res){
            for(int i:a)
                System.out.println(i);
        }
    }
}
