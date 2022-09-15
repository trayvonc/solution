package buchong.dongtaiguihua;

public class changduweikdeshangshengzixuliegeshu {
//    问题描述
//　　给定一个序列 (a_1, a_2, …, a_n), 它的一个上升子序列是指从序列中取出一些元素，按照原来的顺序排列后，是单调递增的序列。
public static void main(String[] args) {
    int n=5,k=2;
    int[] num={3,2,7,6,7};
    int [][]dp=new int[5][k+1];//以i结尾，长度为j的子序列个数
    for(int i=0;i<n;i++){
        dp[i][1]=1;
    }
    for(int len=2;len<=k;len++){
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(num[i]>num[j])
                    dp[i][len]=dp[i][len]+dp[j][len-1];
            }
        }
    }
    int res=0;
    for(int i=0;i<n;i++) res+=dp[i][k];
    System.out.println(res);
}
}
