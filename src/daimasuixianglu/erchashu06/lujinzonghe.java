package daimasuixianglu.erchashu06;

public class lujinzonghe {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return traversal(root,targetSum-root.val);
    }
    boolean traversal(TreeNode node,int count){
        if(node.left==null&&node.right==null&&count==0) return true;
        if(node.left==null&&node.right==null) return false;
        if(node.left!=null) {
            boolean leftRes = traversal(node.left, count - node.left.val);
            if (leftRes == true) return true;
        }
        if(node.right!=null) {
            boolean rightRes = traversal(node.right, count - node.right.val);
            if (rightRes == true) return true;
        }
        return false;
    }
}
