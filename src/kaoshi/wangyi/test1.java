package kaoshi.wangyi;
import java.util.*;
public class test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        int a=in.nextInt();int b=in.nextInt();
        int len1=String.valueOf(a).length();
        int len2=String.valueOf(b).length();
        int ans=Integer.MAX_VALUE;
        List<String> res=subsetsWithDup(String.valueOf(a));
        List<String> res2=subsetsWithDup(String.valueOf(b));
        for(String str1:res){
            if(str1.equals("")){
                continue;
            }
            int num1=Integer.valueOf(str1);
            for(String str2:res2){
                if(str2.equals("")){
                    continue;
                }
                int num2=Integer.valueOf(str2);
                if(num2!=0&&num1%num2==0||num1!=0&&num2%num1==0){
                    ans=Math.min(len1- str1.length()+len2-str2.length(),ans);
                }

            }
        }
        System.out.println(ans==Integer.MAX_VALUE?-1:ans);

    }
    static List<String> subsetsWithDup(String num){
        char[] chars=num.toCharArray();
        List<String> res=new ArrayList<>();
        dfs(chars,res,"",0);
        return res;
    }
    static void dfs(char[] nums,List<String>res,String path,int index){
        res.add(path);
        for(int i=index;i<nums.length;i++){
            dfs(nums,res,path+nums[i],i+1);
        }
    }

}
