package erchashu06;

public class erchasousuoshuzhongdesousuo {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null) return null;
        if(root.val<val) return searchBST(root.right,val);
        if(root.val>val) return searchBST(root.left,val);
        return root;
    }
}
