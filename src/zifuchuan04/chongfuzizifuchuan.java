package zifuchuan04;

public class chongfuzizifuchuan {
    public boolean repeatedSubstringPattern(String s) {
        int[]next=new int[s.length()];
        getNext(next,s);
        if(next[s.length()-1]!=0&&s.length()%(s.length()-next[s.length()-1])==0){
            return true;
        }else return false;

    }
    private void getNext(int[] next,String s){
        int j=0;
        next[0]=j;
        for(int i=1;i<s.length();i++){
            while (j>0&&s.charAt(i)!=s.charAt(j)) j=next[j-1];
            if(s.charAt(i)==s.charAt(j)) j++;
            next[i]=j;
        }
    }

    public static void main(String[] args) {
        chongfuzizifuchuan s=new chongfuzizifuchuan();
        System.out.println(s.repeatedSubstringPattern("asdfasdfasdfasdfa"));
    }
}
