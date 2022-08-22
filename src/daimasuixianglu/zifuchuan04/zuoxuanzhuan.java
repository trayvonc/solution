package daimasuixianglu.zifuchuan04;

public class zuoxuanzhuan {
    public String reverseLeftWords(String s, int n) {
        StringBuilder sb=new StringBuilder(s);
        reverse(sb,0,n-1);
        reverse(sb,n,s.length()-1);
        reverse(sb,0,s.length()-1);
        return sb.toString();
    }
    public void reverse(StringBuilder sb,int start,int end){
        while(start<end){
            char tmp=sb.charAt(start);
            sb.setCharAt(start,sb.charAt(end));
            sb.setCharAt(end,tmp);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        zuoxuanzhuan s=new zuoxuanzhuan();
        System.out.println(s.reverseLeftWords("abcdefg", 2));
    }
}
