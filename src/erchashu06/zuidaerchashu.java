package erchashu06;

public class zuidaerchashu {
    public TreeNode constructMaximumBinaryTree(int[] nums) {

        return traversal(nums,0,nums.length-1);

    }
    public TreeNode traversal(int[] nums, int left, int right){
        if(right==left)return new TreeNode(nums[left]);

        int maxIndex=-1;
        int maxValue=-1;
        for(int i=left;i<=right;i++){
            if(nums[i]>maxValue){
                maxIndex=i;
                maxValue=nums[i];
            }
        }
        TreeNode node=new TreeNode(maxValue);
        if(maxIndex>left)
        node.left=traversal(nums,left,maxIndex-1);
        if(maxIndex<right)
        node.right=traversal(nums,maxIndex+1,right);
        return node;
    }
}
