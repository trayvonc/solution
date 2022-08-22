package kaoshi.erchashu;

import daimasuixianglu.erchashu06.TreeNode;
//dfs方法传入节点root以及到达该节点前的路径总和sum
//递归地求解，如果空节点视为需要删除
//如果为叶子节点，且当前节点与叶子节点的总和sum + root.val小于limit，说明此节点需要删除
//通过节点 node 的每种可能的 “根-叶” 路径上值的总和全都小于给定的 limit的节点，
// 如果一个节点的左右节点均删除证明通过此节点的根-叶路径和小于limit，返回删除

public class gengdaoyelujingshangdebuzujiedian {
    public TreeNode sufficientSubset(TreeNode root, int limit) {
        if(root==null)return null;
        boolean flag=dfs(root,0,limit);
        if(flag) return null;
        return root;


    }
    public boolean dfs(TreeNode root,int sum, int limit){
        if(root==null) return true;
        //全都为空
        sum=sum+root.val;
        //叶子节点判断是否需要删除
        if(root.left==null&&root.right==null)
            return sum<limit;
        //协助删除
        boolean left=dfs(root.left,sum,limit);
        boolean right=dfs(root.right,sum,limit);
        if(left==true){
            root.left=null;
        }
        if(right==true){
            root.right=null;
        }
        //如果有一条孩子的路径能被保留，说明节点有到根路径有大于limit的路径
        //如果所有孩子都没有保留，说明任意到根路径都小于limit
        return left&&right;
    }
}
