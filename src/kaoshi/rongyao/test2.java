package kaoshi.rongyao;

import java.util.ArrayList;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String str="";
        ArrayList<Integer>list=new ArrayList<>();
//        duanChu(525,16);
        for(int i=2;i<=16;i++){
            str=duanChu(n,i);
            if(isHuiWen(str)){
                list.add(i);
            }
        }
        if(list.size()==0){
            System.out.println("-1");
        }else{
            for(int i=0;i<list.size();i++){
                System.out.println(list.get(i));
            }
        }
    }
    public static boolean isHuiWen(String s){
        for(int i=0,j=s.length()-1;i<j;i++,j--){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
        }
        return true;
    }
    public static String duanChu(int a,int b){
        StringBuffer sb=new StringBuffer();
        do{
            sb.insert(0,zhuanhuan(a%b));
            a=a/b;
        }while(a>0);
        return sb.toString();
    }
    public static char zhuanhuan(int n){
        char res;
        if(n<10){
            res=(char) (n+'0');
        }else{
            res=(char) (n-10+'A');
        }
        return res;
    }
}
