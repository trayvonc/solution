package daimasuixianglu.zifuchuan04;

public class fanzhuanzifuchuan {
    public void reverseString(char[] s) {
        int left=0,right=s.length-1;
        while(left<right){
            s[left]^=s[right];
            s[right]^=s[left];
            s[left]^=s[right];
            left++;
            right--;
        }
    }
}
