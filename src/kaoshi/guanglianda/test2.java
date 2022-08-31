package kaoshi.guanglianda;

import java.util.ArrayList;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int [][] limit=new int[m][3];
        ArrayList<ArrayList<Integer>> myList=new ArrayList<>();
        for(int i=0;i<m;i++){
            limit[i][0]=s.nextInt();
            limit[i][1]=s.nextInt();
            limit[i][2]=s.nextInt();
            ArrayList<Integer> tmp=new ArrayList<>();
            for(int j=limit[i][0];j<=limit[i][1];j++) tmp.add(j);
            myList.add(tmp);
        }
        int [][] jiao=new int[m][m];
        for(int i=0;i<m;i++){
//            int iL=limit[i][0];
//            int iR=limit[i][1];
            ArrayList<Integer> tmp1=myList.get(i);
            for(int j=0;j<m;j++){
                int count=0;
//                int jL=limit[i][0];
//                int jR=limit[i][1];
                if(i==j)continue;
                ArrayList<Integer> tmp=myList.get(j);
                for(int k=0;k<tmp.size();k++){
                    if(tmp1.contains(tmp.get(k))){
                        count++;
                    }
                }
                jiao[i][j]=Math.max(count,jiao[j][i]);
//                if(isIn(iL,jL,jR)&&isIn(iR,jL,jR)){
//                    jiao[i][j]=Math.max(iR-iL+1,jiao[j][i]);
//                }else if(isIn(iL,jL,jR)&&!isIn(iR,jL,jR)){
//                    jiao[i][j]=Math.max(jR-iL+1,jiao[j][i]);
//                }
//                else if(!isIn(iL,jL,jR)&&isIn(iR,jL,jR)){
//                    jiao[i][j]=Math.max(iR-jL+1,jiao[j][i]);
//                }else{
//                    jiao[i][j]=Math.max(jiao[i][j],jiao[j][i]);
//                }
            }
        }
        int[] jiaoSum=new int[m];
        int[] yu=new int[m];
        for(int i=0;i<m;i++){
            int sum=0;
            for(int j=0;j<m;j++){
                sum+=jiao[i][j];

            }
            jiaoSum[i]=sum;
            yu[i]=limit[i][1]-limit[i][0]+1-sum;
        }
        int result=0;
        for(int i=0;i<m;i++){
            result+=Math.min(yu[i],limit[i][2]);
        }

        for(int i=1;i<=n;i++){
            int count=0;
            for(int j=0;j<m;j++){
                if(!isIn(i,limit[j][0],limit[j][1])){
                    count++;
                }
            }
            if(count==m) result++;
        }
        System.out.println(result);
    }
    static boolean isIn(int a,int left,int right){
        if(a>=left&&a<=right) return true;
        return false;
    }
}
