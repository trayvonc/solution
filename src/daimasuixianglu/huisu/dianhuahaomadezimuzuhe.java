package daimasuixianglu.huisu;

import java.util.ArrayList;
import java.util.List;

public class dianhuahaomadezimuzuhe {
    final String[] letterMap ={
                "", // 0
                "", // 1
                "abc", // 2
                "def", // 3
                "ghi", // 4
                "jkl", // 5
                "mno", // 6
                "pqrs", // 7
                "tuv", // 8
                "wxyz", // 9
    };
    List<String> result=new ArrayList<>();
    StringBuilder sb=new StringBuilder();
    public List<String> letterCombinations(String digits) {//深度是数字个数，宽度是数字对应字母个数
        if(digits.length()==0)return result;
        backtracking(digits,0);
        return result;
    }
    public void backtracking(String digits,int index){//不允许重复，要加index
        if(index==digits.length()){
            result.add(sb.toString());
            return;
        }
        int digit=digits.charAt(index)-'0';
        String word=letterMap[digit];
        for(int i=0;i<word.length();i++){
            sb.append(word.charAt(i));
            backtracking(digits,index+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
