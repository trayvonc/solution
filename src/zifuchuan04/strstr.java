package zifuchuan04;

public class strstr {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0)return 0;
        int[]next=new int[needle.length()];
        getNext(next,needle);
        int j=0;
        for(int i=0;i<haystack.length();i++){


            while(j>0&&haystack.charAt(i)!=needle.charAt(j)) j=next[j-1];
            if(haystack.charAt(i)==needle.charAt(j)) j++;
            if(j==needle.length())return i-needle.length()+1;
        }
        return -1;


    }
    public void getNext(int[]next,String needle){
        int j=0;
        next[0]=j;
        for(int i=1;i<next.length;i++){
            while(j>0&&needle.charAt(i)!=needle.charAt(j)) j=next[j-1];
            if(needle.charAt(i)==needle.charAt(j)) j++;
            next[i]=j;
        }
    }

    public static void main(String[] args) {
        strstr s=new strstr();
        System.out.println(s.strStr("aaaaa","bba"));
    }
}










