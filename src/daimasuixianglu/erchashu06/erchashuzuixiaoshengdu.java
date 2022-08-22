package daimasuixianglu.erchashu06;

public class erchashuzuixiaoshengdu {
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        int left=minDepth(root.left);
        int right=minDepth(root.right);
        if(root.left==null&&root.right!=null) return right+1;
        if(root.left!=null&&root.right==null) return left+1;
        return 1+Math.min(left,right);

    }
}
