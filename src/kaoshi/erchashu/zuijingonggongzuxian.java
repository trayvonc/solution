package kaoshi.erchashu;

import daimasuixianglu.erchashu06.TreeNode;

public class zuijingonggongzuxian {
    //有三种情况，异侧，p为祖先，q为祖先,线序遍历
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==p||root==q) return root;
        if(root==null) return null;
        TreeNode  left=lowestCommonAncestor(root.left,p,q);
        TreeNode  right=lowestCommonAncestor(root.right,p,q);
        if(left==null&&right==null) return null;
        if(left!=null&&right!=null) return root;
        if(left!=null) return left;
        if(right!=null) return right;
        return root;
    }
}
