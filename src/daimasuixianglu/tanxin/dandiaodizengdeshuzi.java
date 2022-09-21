package daimasuixianglu.tanxin;

public class dandiaodizengdeshuzi {
    public int monotoneIncreasingDigits(int n) {
        String str=String.valueOf(n);
        char[] c=str.toCharArray();
        int start=c.length;
        for(int i=c.length-1;i>0;i--){
            if(c[i-1]>c[i]){
                c[i-1]--;
                start=i;
//                c[i]='9';
            }
        }
        for(int i=start;i<c.length;i++){
            c[i]='9';
        }
        return Integer.parseInt(new String(c));
    }
}
