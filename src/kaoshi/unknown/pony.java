package kaoshi.unknown;

import java.util.LinkedList;
import java.util.Scanner;
//ppoonnyyyynnoopp找出里面有多少个pony序列
//没做出来
public class pony {
    public static int res=0;
    public static LinkedList<Character> path=new LinkedList<>();
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        boolean []used=new boolean[str.length()];
        backtrace(str,0,'p',used);
        System.out.println(res);
    }
    public static void backtrace(String s,int startIndex,char target,boolean[]used){
        if(startIndex>s.length()-1){

            if(path.size()!=0&&path.size()!=4){
                int count=path.size();
                for(int i=used.length-1;i>=0;i--){
                    if(used[i]){
                        used[i]=false;
                        count--;
                        if(count==0)break;
                    }
                }
            }
            return;
        }
        if(s.charAt(startIndex)=='y'&&path.size()==3){
            res++;
            return;
        }


        for(int i=startIndex;i<s.length();i++){
            if(s.charAt(i)!=target)continue;
            if(used[i])continue;
//            s=s.substring(0,i)+s.substring(i+1);
            used[i]=true;
            path.add(s.charAt(i));
            backtrace(s,i+1,next(s.charAt(i)),used);
            path.removeLast();
//            used[i]=false;
//            s=s.substring(0,i)+s.charAt(i)+s.substring(i+1);
        }
    }
    public static char next(char c){
        switch (c){
            case 'p':
                return 'o';

            case 'o':
                return 'n';

            case 'n':
                return 'y';

            case 'y':
                return 'p';

        }
        return 0;
    }
}
