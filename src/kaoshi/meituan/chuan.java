package kaoshi.meituan;

import java.util.Scanner;

public class chuan {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String a=in.next();
        String b=in.next();
//        System.out.println(b);
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<n;i++){
            sb.append(a.charAt(i));
            sb.append(b.charAt(i));
        }
        System.out.println(sb.toString());
    }

}
