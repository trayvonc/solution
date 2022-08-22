package daimasuixianglu.erchashu06;

import java.util.ArrayList;
import java.util.List;

public class lujinzonghe2 {
    List<List<Integer>> res=new ArrayList<>();
    List<Integer> path=new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root==null) return res;
        path.add(root.val);
        traversal(root,targetSum- root.val);
        return res;

    }
    public void traversal(TreeNode node,int count){
        if(node.left==null&&node.right==null&&count==0) res.add(new ArrayList<>(path));
        if(node.left==null&&node.right==null)return;
        if(node.left!=null) {
            path.add(node.left.val);
            traversal(node.left,count- node.left.val);
            path.remove(path.size()-1);
        }
        if(node.right!=null) {
            path.add(node.right.val);
            traversal(node.right,count- node.right.val);
            path.remove(path.size()-1);
        }

    }
}
