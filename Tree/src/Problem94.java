import java.util.LinkedList;
import java.util.List;

public class Problem94 {
//    https://leetcode.com/problems/binary-tree-inorder-traversal/submissions/1006283180/

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        inorder(root, list);
        return list;
    }

    void inorder(TreeNode root, List<Integer> list){
        if(root == null) return;
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
}
