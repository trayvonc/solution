package kaoshi.futu;

import java.util.ArrayList;
import java.util.Scanner;

public class test1 {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        int zu=in.nextInt();
//        ArrayList<String> result=new ArrayList<>();
//        int[]length=new int[zu];
//        String[] strings=new String[zu];
//        for(int i=0;i<zu;i++){
//
//            length[i]=in.nextInt();
//            strings[i]=in.next();
//
//        }
//        for(int i=0;i<zu;i++){
//            int len=length[i];
//            String str=strings[i];
//            String res="";
//            int one=-1;
//            int zero=-1;
//            char[] c=str.toCharArray();
//            for(int j=0;j<len;j++){
//
//                if(c[j]=='1'){
//                    if(j!=len-1){
//                        res+=zero;
//                        res+=" ";
//                    }else{
//                        res+=zero;
//                    }
//                    one=j+1;
//                }
//                else{
//                    if(j!=len-1){
//                        res+=one;
//                        res+=" ";
//                    }else{
//                        res+=one;
//                    }
//                    zero=j+1;
//                }
//
//            }
//            result.add(res);
//        }
//        for(int i=0;i<result.size();i++){
//            System.out.println(result.get(i));
//        }
//    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        int zu=in.nextInt();
    //         ArrayList<String> result=new ArrayList<>();
        int[]length=new int[zu];
        String[] strings=new String[zu];
        for(int i=0;i<zu;i++){
            length[i]=in.nextInt();
            strings[i]=in.next();
        }

        for(int i=0;i<zu;i++){
            int len=length[i];
            String str=strings[i];
//            String res="";
            StringBuilder sb=new StringBuilder();
            int one=-1;
            int zero=-1;
            char[] c=str.toCharArray();
            for(int j=0;j<len;j++){

                if(c[j]=='1'){
                    if(j!=len-1){
//                        res+=zero;
//                        res+=" ";
                        sb.append(zero+" ");
                    }else{
//                        res+=zero;
                        sb.append(zero);

                    }
                    one=j+1;
                }
                else{
                    if(j!=len-1){
//                        res+=one;
//                        res+=" ";
                        sb.append(one+" ");
                    }else{
//                        res+=one;
                        sb.append(one);
                    }

                    zero=j+1;
                }

            }
    //             result.add(res);
            System.out.println(sb);
        }
    //         for(int i=0;i<result.size();i++){
    //             System.out.println(result.get(i));
    //         }
    }
}
