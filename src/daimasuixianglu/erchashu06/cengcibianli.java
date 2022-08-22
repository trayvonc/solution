package daimasuixianglu.erchashu06;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//102.二叉树的层序遍历
//107.二叉树的层次遍历II
//199.二叉树的右视图
//637.二叉树的层平均值
//429.N叉树的层序遍历
//515.在每个树行中找最大值
//116.填充每个节点的下一个右侧节点指针
//117.填充每个节点的下一个右侧节点指针II
//104.二叉树的最大深度
//111.二叉树的最小深度
public class cengcibianli {
    public List<List<Integer>> resList=new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root){
        if(root==null)return resList;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer> itemList=new ArrayList<>();
            int len=queue.size();
            while(len>0){
                TreeNode tmp=queue.poll();
                itemList.add(tmp.val);
                if(tmp.left!=null) queue.offer(tmp.left);
                if(tmp.right!=null) queue.offer(tmp.right);
                len--;
            }
            resList.add(itemList);
        }
        return resList;
    }
}
