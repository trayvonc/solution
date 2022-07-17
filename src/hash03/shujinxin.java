package hash03;

public class shujinxin {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] res=new int[26];
        for(int i=0;i<magazine.length();i++){
            res[magazine.charAt(i)-'a']++;
        }
        for(int i=0;i<ransomNote.length();i++){
            if(res[ransomNote.charAt(i)-'a']>0){
                res[ransomNote.charAt(i)-'a']--;
            }
            else return false;
        }
        return true;

    }
}
