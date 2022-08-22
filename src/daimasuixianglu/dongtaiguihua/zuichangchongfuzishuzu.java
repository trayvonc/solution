package daimasuixianglu.dongtaiguihua;

public class zuichangchongfuzishuzu {//连续
    public int findLength(int[] nums1, int[] nums2) {
        //dp[i][j]定义为 以i-1,j-1结尾的最长重复子数组长度
        int [][]dp=new int [nums1.length+1][nums2.length+1];
//        for(int i=0;i<nums1.length;i++) dp[i][0]=0;
//        for(int j=0;j<nums2.length;j++) dp[0][j]=0;
        int res=0;
        for(int i=1;i<=nums1.length;i++){
            for(int j=1;j<=nums2.length;j++){
                if(nums1[i-1]==nums2[j-1])
                    dp[i][j]=dp[i-1][j-1]+1;
//                else
//                    dp[i][j]=1;
                //如果不相同，最大长度为0，注意和升序默认为1的区别，所以res为理论最小值0
                res=Math.max(res,dp[i][j]);
            }

        }
        return res;

    }
}
