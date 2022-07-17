package erchashu06;

public class zuoyezizhihe {
    public int sum=0;
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null)return 0;
        int leftValue=sumOfLeftLeaves(root.left);
        int rightValue=sumOfLeftLeaves(root.right);
        int midValue=0;
        //左叶子要靠父节点来判断
        if(root.left!=null&&root.left.left!=null&&root.left.right!=null){
            midValue=root.left.val;
        }
        return leftValue+rightValue+midValue;

    }
}
