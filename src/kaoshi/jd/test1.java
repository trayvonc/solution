package kaoshi.jd;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        String str=s.next();
        String str1=str.toUpperCase();
        String str2=str.toLowerCase();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<k;i++){
            sb.append(str1.charAt(i));
        }
        for(int i=k;i<n;i++){
            sb.append(str2.charAt(i));
        }
        System.out.println(sb.toString());
    }

}
