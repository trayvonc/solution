package erchashu06;


public class zhongxuhouxugouzao {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return traversal(inorder,0,inorder.length-1,postorder,0,postorder.length-1);
    }
    public TreeNode traversal(int[]inorder,int inleft,int inright,int[]postorder,int postleft,int postright){
        if(postright-postleft<0) return null;
        TreeNode node=new TreeNode(postorder[postright]);
        //后序只有一个一个节点，叶子节点
        if(postright-postleft==0) return node;
        int divideNum=postorder[postright];
        int index=0;
        for(int i=inleft;i<=inright;i++){
            if(inorder[i]==divideNum) {
                index=i;
                break;
            }
        }
        node.left=traversal(inorder,inleft,index-1,postorder,postleft,postleft+(index-inleft)-1);
        node.right=traversal(inorder,index+1,inright,postorder,postleft+(index-inleft),postright-1);
        return node;

    }
}

