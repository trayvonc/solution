package daimasuixianglu.hash03;

import java.util.HashSet;

public class kuaileshu {
    public boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<>();
        //当和为1或者set有当前元素退出循环
        while(n!=1&&!set.contains(n)){
            set.add(n);
            n=getNextNumber(n);
        }
        if(n==1)return true;
        return false;

    }
    private int getNextNumber(int n){
        int res=0;
        while(n>0){
            int tmp=n%10;
            res+=tmp*tmp;
            n/=10;
        }
        return res;
    }
}
