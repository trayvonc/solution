package buchong.guangduyouxiansousuo;

import java.util.*;

public class dakaizhuanpansuo {
    public int openLock(String[] deadends, String target) {
        if(target.equals("0000"))return 0;
        HashSet<String> set=new HashSet<>();
        for(String de:deadends)set.add(de);
        if(set.contains("0000"))return -1;
        HashSet<String> seen=new HashSet<>();
        seen.add("0000");
        Deque<String> deque=new LinkedList<>();
        deque.offer("0000");
        int step=0;
        while(!deque.isEmpty()){
            step++;
            int deSize=deque.size();
            for(int i=0;i<deSize;i++){
                String staus=deque.poll();
                for(String nextStatus:getNext(staus)) {
                    if (!seen.contains(nextStatus) && !set.contains(nextStatus)) {
                        if (nextStatus.equals(target)) return step;
                        deque.offer(nextStatus);
                        seen.add(nextStatus);

                    }
                }
            }
        }
        return -1;
    }
    public char pre(char now){
        return '0'==now?'9':(char)(now-1);
    }
    public char next(char now){
        return '9'==now?'0':(char)(now+1);
    }
    //旋转一次能够得到的序列
    public List<String> getNext(String status){
        ArrayList<String> res=new ArrayList<>();
        char[] array=status.toCharArray();
        for(int i=0;i<4;i++){
            char num=array[i];
            array[i]=pre(num);
            res.add(new String(array));
            array[i]=next(num);
            res.add(new String(array));
            array[i]=num;
        }
        return res;
    }
}
