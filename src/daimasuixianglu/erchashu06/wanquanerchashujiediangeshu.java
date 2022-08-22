package daimasuixianglu.erchashu06;

public class wanquanerchashujiediangeshu {
//    public int countNodes(TreeNode root) {
//        if(root==null) return 0;
//        int left=countNodes(root.left);
//        int right=countNodes(root.right);
//        return left+right+1;
//    }

//    public int countNodes(TreeNode root) {
//        Deque<TreeNode> deque=new ArrayDeque<>();
//        if(root!=null) deque.offer(root);
//        int res=0;
//        while(!deque.isEmpty()){
//            int size=deque.size();
//            res+=size;
//            for(int i=0;i<size;i++){
//                root=deque.poll();
//                if(root.left!=null) deque.offer(root.left);
//                if(root.right!=null) deque.offer(root.right);
//            }
//        }
//        return res;
//    }
public int countNodes(TreeNode root) {
    if(root==null) return 0;
    TreeNode left=root.left,right=root.right;
    int leftCount=0,rightCount=0;
    while(left!=null){
        left=left.left;
        leftCount++;
    }
    while(right!=null){
        right=right.left;
        rightCount++;
    }
    if(leftCount==rightCount) return (int)Math.pow(2, leftCount)-1+countNodes(root.right)+1;
    else return (int)Math.pow(2, rightCount)-1+countNodes(root.left)+1;

}
}
