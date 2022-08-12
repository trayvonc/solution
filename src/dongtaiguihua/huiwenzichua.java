package dongtaiguihua;

public class huiwenzichua {
    //从下到上，从左到右遍历
    public int countSubstrings(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];//在区间[i,j]判断是否为回文子串
        int res = 0;
        //依赖于左下角，要注意顺序
        for (int i = s.length() - 1; i >= 0; i--) {
            for (int j = i; j < s.length(); j++) {
                if (s.charAt(i) != s.charAt(j)) {
                    continue;//其实不用写,dp为false
                } else {
                    if (i == j || j == i + 1 || dp[i + 1][j - 1]) {
                        res++;
                        dp[i][j] = true;
                    }
                }
            }

        }
        return res;
    }
}
