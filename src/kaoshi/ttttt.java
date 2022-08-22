package kaoshi;
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class ttttt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
//         while (in.hasNextInt()) { // 注意 while 处理多个 case
//             int a = in.nextInt();
//             int b = in.nextInt();
//             System.out.println(a + b);
//         }
        int n=in.nextInt();
        String[] s=new String[n];
        for(int i=0;i<n;i++)
            s[i]=in.next();

        int [] time=new int[n];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<s.length;i++){
            String[] a=s[i].split(":");
            for(int j=0;j<3;j++){
                String b=a[j];
                int c;
                if(b.charAt(0)!='0'){
                    c=Integer.parseInt(b);
                }else{
                    c=Integer.parseInt(b.substring(1));
                }
                if(j==0)
                    time[i]+=c*60*60;
                else if(j==1)
                    time[i]+=c*60;
                else if(j==0)
                    time[i]+=c;
            }
        }

        for(int i=0;i<n;i++){
            if(!map.containsKey(time[i])){
                map.put(time[i],i);
            }
        }
        Arrays.sort(time);
        int index=0,max=0;
        for(int i=0;i<n-1;i++){
            if(time[i+1]-time[i]>max){
                max=time[i+1]-time[i];
                index=i;
            }else if(time[i+1]-time[i]==max){
                if(map.get(time[i])<map.get(time[index])){
                    index=i;
                }
            }
        }
        int last=24*60*60-time[n-1]+time[0];
        if(last>max) index=n-1;
        else if(last==max){
            if(map.get(time[n-1])<map.get(time[index])){
                index=n-1;
            }
        }
        int needtime=time[index];
//        int second=needtime%60;
//        needtime=needtime-second;
//        int minute=(needtime/60)%60;
//        needtime=needtime-minute;
//        int hour=needtime/60;
        int hour=needtime/(60*60);
        needtime=needtime-(hour*60*60);
        int minute=needtime/60;
        int second=needtime-minute*60;
        String sHour,sMin,sSec;
        if(hour<10){
            sHour="0"+hour;
        }else{
            sHour=""+hour;
        }
        if(minute<10){
            sMin="0"+minute;
        }else{
            sMin=""+minute;
        }
        if(second<10){
            sSec="0"+second;
        }else{
            sSec=""+second;
        }
        System.out.println(sHour+":"+sMin+":"+sSec);
    }
}