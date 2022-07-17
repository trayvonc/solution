package erchashu06;

//import javax.swing.tree.TreeNode;

public class fanzhuanerchashu {
    public TreeNode invertTree(TreeNode root) {//中序不行，中序的左子树已经翻转，迭代中序可以，不是指针遍历，是栈中值的遍历，标记性质
        if(root==null) return root;
        swapChild(root);
        invertTree(root.left);
        invertTree(root.right);
        return root;//最后还回到自己本层，做好左右返回根节点

    }
    public void swapChild(TreeNode node){
        TreeNode tmp=node.left;
        node.left=node.right;
        node.right=tmp;
    }
}
