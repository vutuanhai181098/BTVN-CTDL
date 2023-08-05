import java.util.LinkedList;
import java.util.List;

public class Problem144 {

//    https://leetcode.com/problems/binary-tree-preorder-traversal/submissions/1006278084/

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        preorder(root,list);
        return list;
    }

    void preorder(TreeNode root, List<Integer> list){
        if(root == null) return;
        list.add(root.val);
        preorder(root.left, list);
        preorder(root.right, list);
    }
}
