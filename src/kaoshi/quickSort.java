package kaoshi;

public class quickSort {
    public static void main(String[] args) {
        int[] nums={5,1,1,2,0,0};
        sort(nums,0,nums.length-1);
        for(int i:nums) System.out.println(i);
    }
    static void sort(int []nums,int L,int R){
        if(L>=R)return;
//        int mid=(L+R)/2;
//        swap(nums,L,mid);
        int index=L;
        int pri=nums[L];
        for(int i=L+1;i<=R;i++){
            if(nums[i]<pri){
                index++;
                swap(nums,index,i);
            }
        }
        swap(nums,L,index);
        sort(nums,L,index-1);
        sort(nums,index+1,R);
    }
    static void swap(int []nums,int a,int b){
        int tmp=nums[a];
        nums[a]=nums[b];
        nums[b]=tmp;
    }
}
