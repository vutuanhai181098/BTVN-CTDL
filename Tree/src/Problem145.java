import java.util.LinkedList;
import java.util.List;

public class Problem145 {

//    https://leetcode.com/problems/binary-tree-postorder-traversal/submissions/1006286985/

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        postorder(root, list);
        return list;
    }

    void postorder(TreeNode root, List<Integer> list){
        if(root == null) return;
        postorder(root.left, list);
        postorder(root.right, list);
        list.add(root.val);
    }
}
