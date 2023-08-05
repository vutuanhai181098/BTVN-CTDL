public class Problem104 {
//    https://leetcode.com/problems/maximum-depth-of-binary-tree/submissions/1006297166/

    public int maxDepth(TreeNode root) {
        if(root == null) return 0;

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return (left < right ? right : left) + 1;
    }
}
