package kaoshi;

public class xdepingfanggeng {
    public static int mySqrt(int x) {
        if(x==0||x==1)return x;
        int left=0,right=x,ans=-1;
        while(left<right){
            int mid=(left+right)/2;
            if((long)mid*mid<=x){
                //猜小了
                ans=mid;
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(4));
    }
}
