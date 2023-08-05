public class Problem173 {

//    https://leetcode.com/problems/binary-search-tree-iterator/submissions/1011410931/
    ArrayDeque<TreeNode> arrDeque;
    public BSTIterator(TreeNode root) {
        arrDeque = new ArrayDeque<>();
        pushNode(root);
    }
    private void pushNode(TreeNode node){
        while(node != null){
            arrDeque.addLast(node);
            node = node.left;
        }
    }
    public int next() {
        if(arrDeque.isEmpty()) return -1;
        TreeNode res = arrDeque.removeLast();
        pushNode(res.right);
        return res.val;
    }

    public boolean hasNext() {
        return !arrDeque.isEmpty();
    }
}
