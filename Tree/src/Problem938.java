public class Problem938 {
//    https://leetcode.com/problems/range-sum-of-bst/submissions/1008563536/

    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null) return 0;
        int left = rangeSumBST(root.left, low, high);
        int right = rangeSumBST(root.right, low, high);
        return (root.val >= low && root.val <= high ? root.val : 0) + left + right;
    }
}
