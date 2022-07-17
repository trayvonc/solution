package zifuchuan04;

public class tihuankongge {
    public String replaceSpace(String s) {
        StringBuilder  str=new StringBuilder ();
        for(char i:s.toCharArray()){
            if(i==' ') str.append("  ");
        }
        if(str.length()==0) return s;
        int left=s.length()-1;
        s+=str.toString();
        int right=s.length()-1;
        char[]c=s.toCharArray();
        while (left>=0){
            if(c[left]!=' '){
                c[right]=c[left];
            }else{
                c[right--]='0';
                c[right--]='2';
                c[right]='%';
            }
            left--;
            right--;
        }
        return new String(c);
    }

    public static void main(String[] args) {
        tihuankongge s=new tihuankongge();
        System.out.println(s.replaceSpace("tyuyt yyu yttr a"));
    }
}
