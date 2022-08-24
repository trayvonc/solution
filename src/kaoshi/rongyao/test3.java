package kaoshi.rongyao;

import java.util.ArrayList;
import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        String[]str=s.split(":");
        String cmd=str[0];
        String content=str[1];
        int res;
        switch (cmd){
            case "1":
                res=bushu(content);
                System.out.println(res);
                break;
            case "2":
                res=hash(content);
                System.out.println(res);
                break;
            case "3":
                res=choose(content);
                System.out.println(res);
                break;
            case "4":
                res=mingzhong(content);
                System.out.println(res);
                break;
            case "5":
                res=xinzeng(content);
                System.out.println(res);
                break;
        }
    }
    static int bushu(String content){
        String[] num=content.split("_");
        String n=num[1];
        int a;
        if(n.charAt(0)=='0'){
            a=Integer.parseInt(n.charAt(1)+"");
        }else{
            a=Integer.parseInt(n);
        }
        return (a-1)*50;
    }
    static int hash(String content){
        int res=0;
        for(int i=0;i<content.length();i++){
            res+=Integer.valueOf(content.charAt(i));
        }
        return res%999;
    }
    static int choose(String content){
        String[] str=content.split(";");
        String dang=str[0];String token=str[1];
        String[] dangji=dang.split(",");
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<dangji.length;i++){
            list.add(bushu(dangji[i]));
        }
        int hash=hash(token);
        int i=0;boolean flag=false;
        while(i<=950){
            if(i>=hash&&!list.contains(i)){
                flag=true;
                break;
            }
            i+=50;
        }
        if(flag==false){
            i=0;
        }
        return i;
    }
    static int mingzhong(String content){
        String[] num=content.split("_");
        String n=num[2];
        int a;
        if(n.charAt(0)=='0'){
            a=Integer.parseInt(n.charAt(1)+"");
        }else{
            a=Integer.parseInt(n);
        }
        // 奇数
        if(a%2==1){
            return a*25;
        }else {
            return (a-1)*25+500;
        }
    }
    static int xinzeng(String content){
        String[] str=content.split(";");
        String add=str[0];String token=str[1];
        String[] num=add.split("_");
        String n=num[2];
        int a;
        if(n.charAt(0)=='0'){
            a=Integer.parseInt(n.charAt(1)+"");
        }else{
            a=Integer.parseInt(n);
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<=a;i++){
            if(i%2==1){
                list.add(i*25);
            }else {
                list.add((i-1)*25+500);
            }
        }
        int hash=hash(token);
        int i=0;boolean flag=false;
//        hash=2;
        while(i<=975){
            if(i%50==25){
                if(i>=hash&&list.contains(i)){
                    flag=true;
                    break;
                }
            }else{
                if(i>=hash){
                    flag=true;
                    break;
                }
            }
            i+=25;
        }
        if(flag==false){
            i=0;
        }
        return i;
    }

}
