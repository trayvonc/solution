package kaoshi.wangyi;
import java.util.*;
public class test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        int a=in.nextInt();int[]b=new int[a];
        for(int i=0;i<a;i++)b[i]=in.nextInt();
//         HashMap<Integer,int[]>map=new HashMap<>();
//         for(int i=0;i<a-1;i++){
//             int[]tmp=new int[2];
//             tmp[0]=b[i];tmp[1]=b[i+1];
//             map.put(i,tmp);
//         }
        int res=Integer.MAX_VALUE;
        for(int i=0;i<a-1;i++){
            int left=b[i],right=b[i+1];
            if(left==right)continue;
            if(i%2==1){
                int t=left;
                left=right;
                right=t;
            }
            int sum=0;int flag=1;
            for(int j=0;j<a;j++){
                if(j%2==0){
                    if(b[j]!=left){
                        if(left<b[j]){
                            flag=0;break;
                        }else{
                            sum+=(left-b[j]);
                        }
                    }
                }else{
                    if(b[j]!=right){
                        if(right<b[j]){
                            flag=0;break;
                        }else{
                            sum+=(right-b[j]);
                        }
                    }
                }
            }
//            res=Math.min(sum,res);
            if(sum<res&&flag==1){
//                System.out.println(left);
//                System.out.println(right);
                res=sum;
            }
        }

        System.out.println(res);



    }
}
