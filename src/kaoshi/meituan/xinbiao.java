package kaoshi.meituan;

import java.util.*;

public class xinbiao {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int [][]xin=new int[3][2];
        for(int i=0;i<3;i++){
            xin[i][0]=in.nextInt();
            xin[i][1]=in.nextInt();
        }
        int[]dis=new int[3];
        for(int i=0;i<3;i++){
            dis[i]=in.nextInt();
        }
        ArrayList<int[][]> set=new ArrayList<>();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(isMan(dis,xin,i,j)){
                    int[][] tmp=new int[1][2];
                    tmp[0][0]=i;
                    tmp[0][1]=j;
                    set.add(tmp);
                }

            }
        }
//        Iterator it=set.iterator();
        int[][]ttt=set.get(0);
        int c=ttt[0][0];
        int d=ttt[0][1];
//        int c=-1;int d=-1;
        for(int i=1;i<set.size();i++){
            int[][]e=set.get(i);
            int a=e[0][0];
            int b=e[0][1];
            if(a<c){
                c=a;
                d=b;
            }else if(a==c&&b<d){
                c=a;
                d=b;
            }
        }
        System.out.println(c+" "+d);

    }
    static boolean isMan(int[]dis,int[][]xin,int i,int j){
        for(int k=0;k<dis.length;k++){
            if(Math.abs(xin[k][0]-i)+Math.abs(xin[k][1]-j)==dis[k]){
//                System.out.println(i+","+j+","+xin[k][0]+","+xin[k][1]);
                return true;
            }

        }
        return false;
    }
}
