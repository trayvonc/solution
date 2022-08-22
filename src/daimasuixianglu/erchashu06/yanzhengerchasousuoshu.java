package daimasuixianglu.erchashu06;

public class yanzhengerchasousuoshu {
    public Long maxValue=Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        if(root==null)return true;

        boolean left=isValidBST(root.left);
        if(!left)return false;
        if(maxValue>=root.val) return false;
        else maxValue= Long.valueOf(root.val);
        boolean right=isValidBST(root.right);
        return right;

    }
}
