package erchashu06;

public class erchashuzuidashengdu {
    public int maxDepth(TreeNode root) {//后续是冒泡方式，从尾部到头计算最长距离
        if(root==null) return 0;
        int left=maxDepth(root.left);
        int right=maxDepth(root.right);
        return Math.max(left,right)+1;

    }
}

//先序就是已知求这个节点的深度，从左右回溯试探（从根开始）
//class solution {
//    public:
//    int result;
//    void getdepth(treenode* node, int depth) {
//        result = depth > result ? depth : result; // 中
//
//        if (node->left == NULL && node->right == NULL) return ;
//
//        if (node->left) { // 左
//            depth++;    // 深度+1
//            getdepth(node->left, depth);
//            depth--;    // 回溯，深度-1
//        }
//        if (node->right) { // 右
//            depth++;    // 深度+1
//            getdepth(node->right, depth);
//            depth--;    // 回溯，深度-1
//        }
//        return ;
//    }
//    int maxdepth(treenode* root) {
//        result = 0;
//        if (root == NULL) return result;
//        getdepth(root, 1);
//        return result;
//    }
//};
