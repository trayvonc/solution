package daimasuixianglu.erchashu06;

public class pinghengerchashu {
    public boolean isBalanced(TreeNode root) {//求高度用先序，不用遍历到空节点，因为空节点没有高度
        return getHeight(root)==-1?false:true;
    }
    public int getHeight(TreeNode node){
        if(node==null) return 0;
        int left=getHeight(node.left);
        int right=getHeight(node.right);
        if(left==-1||right==-1) return -1;
        if(Math.abs(left-right)>1) return -1;
        return Math.max(left,right)+1;

    }
}
