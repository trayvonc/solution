package daimasuixianglu.zifuchuan04;

public class fanzhuanzifuchuanlidedanci {
    public String reverseWords(String s) {
        StringBuilder str=new StringBuilder (s);
        str=yichu(str);
        System.out.println(str);
        fanzhuan(str,0,str.length()-1);
        System.out.println(str);
        fanzhuanEach(str);
        System.out.println(str);


        return str.toString();


    }
    //移除多余空格
    public StringBuilder  yichu(StringBuilder  s){
        int start=0,end=s.length()-1;
        while(s.charAt(start)==' ')start++;
        while(s.charAt(end)==' ')end--;
        StringBuilder res=new StringBuilder();
        while(start<=end){
            if(s.charAt(start)!=' '||s.charAt(start-1)!=' '){
                res.append(s.charAt(start));
            }
            start++;
        }
        return res;

    }
    //反转字符串
    public void fanzhuan(StringBuilder str,int left,int right){
//        char[] s=str.toString().toCharArray();
//        while(left<right){
//            s[left]^=s[right];
//            s[right]^=s[left];
//            s[left]^=s[right];
//            left++;
//            right--;
//        }
//        str=new StringBuilder(new String(s));
//        return str;
        while(left<right){
            char tmp=str.charAt(left);
            str.setCharAt(left,str.charAt(right));
            str.setCharAt(right,tmp);
            left++;
            right--;
        }
    }
    public void fanzhuanEach(StringBuilder str){
        int start=0,end=1,n=str.length();
        while(start<n){
            //提取单个单词
            while(end<n&&str.charAt(end)!=' ')end++;
            fanzhuan(str,start,end-1);
            start=end+1;
            end=start+1;

        }
//        return str.toString();

    }


    public static void main(String[] args) {
        fanzhuanzifuchuanlidedanci s=new fanzhuanzifuchuanlidedanci();
        System.out.println(s.reverseWords("the sky is blue"));
    }

}
