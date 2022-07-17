package erchashu06;

public class zhaoshuzuoxiaojiaodezhi {
    public int maxLeftValue=Integer.MIN_VALUE;
    public int maxValue=Integer.MIN_VALUE;
    public int findBottomLeftValue(TreeNode root) {

        traversal(root,0);
        return maxLeftValue;
    }
    public void traversal(TreeNode node,int leftLen){
        if(node.left==null&&node.right==null){
            if(leftLen>maxValue){
                maxValue=leftLen;
                maxLeftValue=node.val;
            }
        }
        if(node.left!=null){
            traversal(node.left,leftLen+1);
        }
        if(node.right!=null){
            traversal(node.right,leftLen+1);
        }
    }
}
