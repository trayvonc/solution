package dongtaiguihua;
import erchashu06.TreeNode;
public class dajiajieshe3 {
    public int rob(TreeNode root) {
        int [] res=robTree(root);
        return Math.max(res[0],res[1]);
    }
    public int[] robTree(TreeNode node){
        int[]res=new int[2];
        if(node==null) return res;
        int [] left=robTree(node.left);
        int [] right=robTree(node.right);
        //不偷
        res[0]=Math.max(left[0],left[1])+Math.max(right[0],right[1]);
        //偷
        res[1]=node.val+left[0]+right[0];
        return res;
    }
}
