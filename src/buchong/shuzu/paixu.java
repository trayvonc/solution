package buchong.shuzu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class paixu {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(-1);
        arrayList.add(2);
        arrayList.add(1);
        Collections.sort(arrayList, (o1, o2) -> o2-o1);
        System.out.println(arrayList);

    }
}
