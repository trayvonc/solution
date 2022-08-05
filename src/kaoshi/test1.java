package kaoshi;

import java.io.*;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
//        FileInputStream fileInputStream=null;
        FileReader reader=null;
        FileWriter writer=null;
        int res=0;
        try {
//            fileInputStream=new FileInputStream("count.in");
//            byte[] bytes=new byte[4];
            reader=new FileReader("count.in");
            writer=new FileWriter("C:\\Users\\chenlab\\IdeaProjects\\solution\\src\\kaoshi\\count.out");
            int readCount=0;
            StringBuffer sb=new StringBuffer();
            while((readCount=reader.read())!=-1){
//                System.out.println((char) readCount);
                sb.append((char) readCount);
//                sb.append(new String(bytes,0,readCount));
            }
            writer.write(new String(sb).toCharArray());
            System.out.println(sb);
//            String in =new String(sb);
//            String[]my=in.split(" ");
//            String a;
//            int n=Integer.parseInt(my[0]);
////            int target=Character.valueOf(my[1]);
//            for(int i=1;i<=n;i++){
//                String tmp=String.valueOf(i);
//                char[] t=tmp.toCharArray();
//                for(int j=0;j<t.length;j++){
//                    a=String.valueOf(t[j]);
//                    if(a.equals(my[1])) res++;
//                }
//            }
//            System.out.println(res);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if(writer!=null){
                try{
                    writer.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            if(reader!=null){
                try{
                    reader.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
//        try {
//            FileOutputStream fileOutputStream=new FileOutputStream("count.out");
//            byte[] bytes=new byte[4];
//            int readCount=0;
//            StringBuffer sb=new StringBuffer();
//            fileOutputStream.write(bytes);
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }


//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int ans = 0;
//        for(int i=0;i<n;i++){
//            String a=String.valueOf(i);
//            char[] s=a.toCharArray();
//            StringBuffer sb=new StringBuffer();
//            for(int j=s.length-1;j>=0;j--){
//                sb.append(s[j]);
//            }
//            String tmp=new String(sb);
//            int my=Integer.parseInt(tmp);
//            if(i+n==my) ans++;
//        }
//        System.out.println(ans);


    }






}
