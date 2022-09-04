package daimasuixianglu.huisu;

import javax.sound.sampled.EnumControl;
import java.util.*;

public class chongxinanpaixingcheng {
    HashMap<String, Map<String,Integer>> map=new HashMap<>();
    LinkedList<String> res=new LinkedList<>();
    public List<String> findItinerary(List<List<String>> tickets) {
        for(List<String> t:tickets){
            Map<String,Integer> tmp;
            if(map.containsKey(t.get(0))){
                tmp=map.get(t.get(0));
                tmp.put(t.get(1),tmp.getOrDefault(t.get(1),0)+1);
            }else{
                tmp=new TreeMap<>();//升序map
                tmp.put(t.get(1),1);
            }
            map.put(t.get(0),tmp);
        }
        res.add("JFK");
        backTracking(tickets.size());
        return res;

    }
    public boolean backTracking(int ticketNum){
        if(ticketNum+1==res.size())return true;
        String last=res.getLast();
        if(!map.containsKey(last))return false;
        for(Map.Entry<String,Integer> to:map.get(last).entrySet()){
            int count=to.getValue();
            if(count>0){
                res.add(to.getKey());
                to.setValue(count-1);
                if(backTracking(ticketNum))return true;
                to.setValue(count);
                res.removeLast();
            }
        }
        return false;
    }
}
