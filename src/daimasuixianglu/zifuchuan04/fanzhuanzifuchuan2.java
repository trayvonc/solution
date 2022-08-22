package daimasuixianglu.zifuchuan04;

public class fanzhuanzifuchuan2 {
    public String reverseStr(String s, int k) {
        int left,right;
        char[]c=s.toCharArray();
        for(int i=0;i<s.length();i+=2*k){
            left=i;right=i+k-1<s.length()?i+k-1:s.length()-1;
            while(left<right){
                c[left]^=c[right];
                c[right]^=c[left];
                c[left]^=c[right];
                left++;
                right--;
            }
        }
        s=String.copyValueOf(c);
        return s;
    }

    public static void main(String[] args) {
        fanzhuanzifuchuan2 s=new fanzhuanzifuchuan2();
        System.out.println(s.reverseStr("abcdefg",2));
    }
}
