package erchashu06;

import java.util.ArrayList;
import java.util.List;
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
public class nchashuxianxu {
    List res=new ArrayList<Integer>();
    public List<Integer> preorder(Node root) {
        if(root==null) return null;
        res.add(root.val);
        for(int i=0;i<root.children.size();i++){
            preorder(root.children.get(i));
        }
        return res;

    }
}
