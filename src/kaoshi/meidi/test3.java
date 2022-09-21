package kaoshi.meidi;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        int perfect=0;
//        int great=0;
        int miss=0;
        int res=0;
        char[] arr=str.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='P'){
                perfect++;
                if(perfect>3){
                    res+=15;
                }else{
                    res+=10;
                }
            }else if(arr[i]=='G'){
                perfect=0;
                miss=0;
                res+=5;

            }else{
                miss++;

                perfect=0;
                if(miss==3){
                    break;
                }
            }
        }
        System.out.println(res);
    }
}
