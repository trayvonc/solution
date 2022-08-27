package buchong.lianbiao;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {
    public LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
    public int capacity;
    public LRUCache(int capacity) {
        this.capacity=capacity;
    }

    public int get(int key) {
        if(map.containsKey(key)){
            int value=map.get(key);
            map.remove(key);
            map.put(key,value);
            return value;
        }
        return -1;
    }

    public void put(int key, int value) {
        if(map.containsKey(key)){
            map.remove(key);
            map.put(key,value);
        }
        if(map.size()<capacity){
            map.put(key,value);
        }else{
            Iterator <Map.Entry<Integer,Integer>>iterator=map.entrySet().iterator();
            iterator.next();
            iterator.remove();
            map.put(key,value);
        }

    }
}
