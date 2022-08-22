package daimasuixianglu.hash03;

public class zimuyiwei {
    public boolean isAnagram(String s, String t) {
        int[] res=new int[26];
        for(char i:s.toCharArray()){
            res[i-'a']+=1;
        }
        for(char i:t.toCharArray()){
            res[i-'a']-=1;
        }
        //如果不为0表示不能互相包含
        for(int i:res){
            if(i!=0)return false;
        }
        return true;

    }

    public static void main(String[] args) {
        zimuyiwei s=new zimuyiwei();
        System.out.println(s.isAnagram("anagram","nagaram"));
    }
}
