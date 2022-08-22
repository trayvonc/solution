package daimasuixianglu.erchashu06;

//import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class tongyidiedai {
    public List<Integer> preorder(TreeNode root){//中左右,入栈反序
        List<Integer> res=new ArrayList<>();
        Stack<TreeNode> st=new Stack<>();
        if(root!=null) st.push(root);
        while(!st.isEmpty()){
            TreeNode node =st.peek();
            if(node!=null){
                st.pop();//弹出，避免反复操作
                if(node.right!=null) st.push(node.right);
                if(node.left!=null) st.push(node.left);
                st.push(node);
                st.push(null);
            }else{
                st.pop();
                node=st.peek();
                st.pop();
                res.add(node.val);
            }
        }
        return res;
    }
    public List<Integer> inorder(TreeNode root){//左中右,入栈反序
        List<Integer> res=new ArrayList<>();
        Stack<TreeNode> st=new Stack<>();
        if(root!=null) st.push(root);
        while(!st.isEmpty()){
            TreeNode node =st.peek();
            if(node!=null){
                st.pop();//弹出，避免反复操作
                if(node.right!=null) st.push(node.right);
                st.push(node);
                st.push(null);
                if(node.left!=null) st.push(node.left);

            }else{
                st.pop();
                node=st.peek();
                st.pop();
                res.add(node.val);
            }
        }
        return res;
    }
    public List<Integer> postorder(TreeNode root){//左右中,入栈反序
        List<Integer> res=new ArrayList<>();
        Stack<TreeNode> st=new Stack<>();
        if(root!=null) st.push(root);
        while(!st.isEmpty()){
            TreeNode node =st.peek();
            if(node!=null){
                st.pop();//弹出，避免反复操作
                st.push(node);
                st.push(null);
                if(node.right!=null) st.push(node.right);

                if(node.left!=null) st.push(node.left);

            }else{
                st.pop();
                node=st.peek();
                st.pop();
                res.add(node.val);
            }
        }
        return res;
    }

}
