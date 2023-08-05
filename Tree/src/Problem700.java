public class Problem700 {
//    https://leetcode.com/problems/search-in-a-binary-search-tree/submissions/1006263284/

    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null || root.val == val){
            return root;
        }
        if(val > root.val){
            return searchBST(root.right, val);
        } else {
            return searchBST(root.left, val);
        }
    }


//    https://leetcode.com/problems/search-in-a-binary-search-tree/submissions/1006258302/
    public TreeNode searchBST(TreeNode root, int val) {
        while (root != null) {
            if (val == root.val) {
                return root;
            }
            if (val > root.val) {
                root = root.right;
            } else {
                root = root.left;
            }
        }
        return root;
    }
}
