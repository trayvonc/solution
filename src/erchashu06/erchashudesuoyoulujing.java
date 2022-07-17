package erchashu06;

import java.util.ArrayList;
import java.util.List;

public class erchashudesuoyoulujing {
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<Integer> path=new ArrayList<>();
        List<String> result=new ArrayList<>();
        traversal(root,path,result);
        return result;
    }
    public void traversal(TreeNode node, ArrayList path,List result){
        path.add(node.val);
        if(node.left==null&&node.right==null) {//处理到叶子节点
            StringBuilder stringBuilder=new StringBuilder();
            for(int i=0;i<path.size()-1;i++){
                stringBuilder.append(path.get(i));
                stringBuilder.append("->");
            }
            stringBuilder.append(path.get(path.size()-1));
            result.add(stringBuilder.toString());
            return;
        }


        if(node.left!=null){
            traversal(node.left,path,result);
            path.remove(path.size()-1);
        }
        if(node.right!=null){
            traversal(node.right,path,result);
            path.remove(path.size()-1);
        }
    }
}
