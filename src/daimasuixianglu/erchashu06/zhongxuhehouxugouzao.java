package daimasuixianglu.erchashu06;

public class zhongxuhehouxugouzao {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return traversal(inorder,0,inorder.length-1,postorder,0,postorder.length-1);
    }
    public TreeNode traversal(int[]inorder, int inleft, int inright, int[]postorder, int postleft, int postright){
        if(postorder.length==0) return null;
        TreeNode node=new TreeNode(postorder[postorder.length-1]);
        //中序只有一个一个节点，叶子节点
        if(inorder.length==1) return node;
        int divideNum=postorder[postorder.length-1];
        int index=0;
        for(int i=inleft;i<=inright;i++){
            if(inorder[i]==divideNum) {
                index=i;
                break;
            }
        }
        node.left=traversal(inorder,inleft,index-1,postorder,postleft,postleft+(inright-inleft));
        node.right=traversal(inorder,index+1,inright,postorder,postleft+(inright-inleft)+1,postright-1);
        return node;

    }
}
