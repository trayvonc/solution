package kaoshi.huawei.erfensousuo;

public class zhaoshanmai {
    public static int peakIndexInMountainArray(int[] arr) {
        int left=0,right=arr.length,index=0;
        while(left<right){
            int mid=(left+right)/2;
            if(arr[mid]>arr[mid+1]){
                index=mid;
                right=mid;
            }
            else{
//                index=mid+1;
                left=mid+1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[]arr={0,1,0};
        System.out.println(peakIndexInMountainArray(arr));
    }
}
