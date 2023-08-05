public class Problem450 {
//  https://leetcode.com/problems/delete-node-in-a-bst/submissions/1012249088/
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;
        // Tìm nút cần xóa và nút cha của nó.
        TreeNode currNode = root;
        TreeNode parentNode = null;
        while (currNode != null && currNode.val != key) {
            parentNode = currNode;
            if (key < currNode.val) {
                currNode = currNode.left;
            } else {
                currNode = currNode.right;
            }
        }
        // Lặp qua BST, nếu không tìm thấy nút cần xóa trả về root.
        if(currNode == null) return root;
        // Trường hợp nút chỉ có 1 nút con trái hoặc phải:
        if(currNode.left == null){
            // Nút trái của nút hiện tại null:
            if(parentNode == null){
                // Nút cha cũng = null => nút phải của nút cần xóa.
                return currNode.right;
            }
            if(currNode == parentNode.left){
                //Nút hiện tại là nút trái của nút cha => gắn nút trái của nút cha với nút phải của nút cần xóa
                parentNode.left = currNode.right;
            } else {
                // Ngược lại, gắn nút phải của nút cha với nút phải của nút cần xóa
                parentNode.right = currNode.right;
            }
        } else if(currNode.right == null){
            if(parentNode == null){
                return currNode.left;
            }
            if(currNode == parentNode.left){
                parentNode.left = currNode.left;
            } else {
                parentNode.right = currNode.left;
            }
        }
        // Trường hợp nút có 2 nút con
        else {
            TreeNode maxL = currNode.left;
            // Tìm maxVal của cây con trái nút hiện tại(nút cần xóa)
            while(maxL.right != null){
                maxL = maxL.right;
            }
            // Gán giá trị maxVal cho nút hiện tại
            currNode.val = maxL.val;
            // Thực hiện xóa nút có giá trị maxVal từ cây trái của nút hiện tại
            currNode.left = deleteNode(currNode.left, maxL.val);
        }
        return root;
    }
}
