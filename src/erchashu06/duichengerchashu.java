package erchashu06;

public class duichengerchashu {
    public boolean isSymmetric(TreeNode root) {
        return compare(root.left,root.right);

    }
    public boolean compare(TreeNode left,TreeNode right){
        if(left==null&&right==null) return true;
        else if (left==null&&right!=null) {
            return false;
        } else if (left!=null&&right==null) {
            return false;
        } else if (left.val!= right.val) {
            return false;
        }
        boolean left_val=compare(left.left, right.right);
        boolean right_val=compare(left.right,right.left);
        return left_val&&right_val;

    }
}
