package kaoshi.baidu;

public class wuchongfuzifudezuichangzichuan2 {
    public static void main(String[] args) {
        String s="adjhfalkdfhakhfdkljadkjlfahdfasdfkjaksd";
        int left=0,right=0;
        char[] c=s.toCharArray();
        int[] freq=new int[128];
        int len=0;
        while(right<s.length()){
            freq[c[right]]++;
            while(freq[c[right]]>1){
                freq[c[left]]--;
                left++;
            }
            right++;
            len=Math.max(len,right-left);
        }
    }
}
