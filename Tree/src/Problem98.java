public class Problem98 {
//    https://leetcode.com/problems/validate-binary-search-tree/submissions/1009599065/

    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        // Sử dụng ArrayDeque để lưu trữ các nút của cây
        ArrayDeque<TreeNode> arrDeque = new ArrayDeque<>();
        // Tạo 1 nút để lưu giá trị của nút trước đó.
        TreeNode pre = null;
        while(root != null || !arrDeque.isEmpty()){
            // Đẩy nút hiện tại và các nút con bên trái của nó vào arr
            while(root != null){
                arrDeque.add(root);
                root = root.left;
            }
            // root = null
            // Lấy ra từng nút từ arr và kiểm tra với nút trước đó <pre>.
            root = arrDeque.removeLast();
            if(pre != null && root.val <= pre.val) return false;
            // Cập nhật lại nút pre và duyệt sang cây con bên phải của nút hiện tại.
            pre = root;
            root = root.right;
        }
        return true;
    }
}
