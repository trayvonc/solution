package buchong.shuzu;

public class quickSort {
    static  int cnt=0;
    public static void main(String[] args) {
        //让前k个有序
        int[] nums={0,1,2,3,4,5,6,7,8,9};
        sort(nums,0,nums.length-1,2);
        for(int i:nums) System.out.println(i);
    }
    static void sort(int []nums,int L,int R,int k){
        if(L>=R)return;
//        int mid=(L+R)/2;
//        swap(nums,L,mid);
        int index=L;
        int pri=nums[L];
        for(int i=L+1;i<=R;i++){
            if(nums[i]>pri){
                index++;
                swap(nums,index,i);
            }
        }
        swap(nums,L,index);
        sort(nums,L,index-1,k);
        cnt+=index-L+1;
        System.out.println(cnt);
        if(cnt<k){
            sort(nums,index+1,R,k);
            cnt+=R-index+1;
        }

    }
    static void swap(int []nums,int a,int b){
        int tmp=nums[a];
        nums[a]=nums[b];
        nums[b]=tmp;
    }
}
