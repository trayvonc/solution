package daimasuixianglu.erchashu06;

public class qianxuzhongxugouzao {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return  traversal(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }
    public TreeNode traversal(int[] preorder,int preLeft,int preRight,
                              int[] inorder,int inLeft,int inRight){
        if(preRight-preLeft<0) return null;
        int indexVal=preorder[preLeft];
        TreeNode node=new TreeNode(indexVal);
        if(preRight-preLeft==0)return node;
        int divideIndex=0;
        for(int i=inLeft;i<=inRight;i++){
            if(inorder[i]==indexVal){
                divideIndex=i;
                break;
            }
        }
        node.left=traversal(preorder,preLeft+1,preLeft+1+(divideIndex-1-inLeft),inorder,inLeft,divideIndex-1);
        node.right=traversal(preorder,preLeft+1+(divideIndex-1-inLeft)+1,preRight,inorder,divideIndex+1,inRight);
        return node;

    }
}
