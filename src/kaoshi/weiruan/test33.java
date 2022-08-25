package kaoshi.weiruan;

public class test33 {
    public static int solution(int[] A) {
        // write your code in Java 11 (Java SE 11)
        int[]delta=new int[A.length];
        for(int i=1;i<A.length;i++){
            delta[i]=A[i]-A[i-1];
        }
        int left=1;int right=1;
        int lastLeft=left;
        Long res=new Long(0);
        while(right<delta.length){
            int tmp=delta[right];
            while(delta[left]!=tmp&&left<right){
                left++;
            }
            if(right+1<delta.length&&delta[right+1]==delta[right]){
                right++;
                continue;
            }
            if(left+1==right){
               res+=1;
            }else if(left+1<right){
                res+=getNum(right-left);
            }
//            lastLeft=left;
            right++;
        }
//        for(int i=1;i<A.length;i++){
//            int j=i;
//            for(int k=i;k>=1;k--){
//                if(delta[k]!=delta[i]){
//                    j=k;
//                    break;
//                }
//            }
//            if(i==j||j+1==i) {
//                continue;
//            }
//            if(delta[j+1]==delta[i]){
//                    res+=getNum(i-j+2);
//            }
//        }
        return res.intValue();
    }
    static int getNum(int n){
        if(n==0)return 0;
        return n+getNum(n-1);
    }

    public static void main(String[] args) {
        int []A={-1,1,3,3,3,2,3,2,1,0};
        System.out.println(solution(A));
    }
}
