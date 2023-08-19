public class Problem100 {

//    https://leetcode.com/problems/same-tree/submissions/1025671804/

    // Sử dụng đệ quy
//    public boolean isSameTree(TreeNode p, TreeNode q) {
//        // Nếu cây p và cây q đều rỗng (không có nút nào) trả về true;
//        if(p == null && q == null) return true;
//        // Nếu có một trong 2 cây p hoặc q là null, hoặc giá trị của nút hiện tại trong cây p
//        // khác giá trị của nút hiện tại trong cây q, hàm trả về false.
//        if(p == null || q == null || p.val != q.val) return false;
//        // Nếu không thỏa mãn các điều kiện trên,so sánh các cây con của p và q.
//        // gọi hàm isSameTree với cây con trái và cây con phải của p và q.
//        // Nếu cả 2 cây con đều giống nhau -> trả về true.
//        // Ngược lại, nếu 1 trong 2 cây con khác nhau -> trả về false.
//        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
//    }
//    // Time complexity: O(min(n,m)) với n và m là kích thước của cây.
}
