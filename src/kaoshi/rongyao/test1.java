package kaoshi.rongyao;

import java.util.HashMap;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        String[] str=s.split(",");
        for(int i=0;i< str.length;i++){
            char[] c=str[i].toCharArray();
            for(int j=0;j<c.length;j++){
                if(j==0&&(c[j]<'A'||c[j]>'Z')){
                    System.out.println("error.0001");
                    return;
                }
                if(j>0&&(c[j]<'a'||c[j]>'z')){
                    System.out.println("error.0001");
                    return;
                }
            }
        }
        HashMap<String,Integer> map=new HashMap<>();
        int max=0;String res="";
        for(int i=0;i<str.length;i++){
            map.put(str[i],map.getOrDefault(str[i],0)+1);
            if(map.getOrDefault(str[i],0)>max){
                max=map.getOrDefault(str[i],0);
                res=str[i];
            }
            if(map.getOrDefault(str[i],0)==max){
                res=res+","+str[i];
            }
        }
        String[] my=res.split(",");
        if(my.length==1){
            System.out.println(my[0]);
        }else{
            String maxString=my[0];
            for(int i=1;i< my.length;i++){
                int myres=compare(maxString,my[i]);
                if(myres==-1){
                    maxString=my[i];
                }
            }
            System.out.println(maxString);
        }

    }
    static int compare(String a,String b){
        int lena=a.length();int lenb=b.length();
        for(int i=0;i<lena&&i<lenb;i++){
            if(a.charAt(i)<b.charAt(i)){//a在前
                return 1;
            }else if(a.charAt(i)>b.charAt(i)){
                return -1;
            }
        }
        if(lena<lenb) return 1;
        return -1;
    }

}
