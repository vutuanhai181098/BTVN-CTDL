import java.util.Stack;

public class Problem160 {

//    https://leetcode.com/problems/intersection-of-two-linked-lists/submissions/


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // tạo một set để lưu trữ các nút của headA.
        Set<ListNode> set = new HashSet<>();
        // Duyệt qua danh sách liên kết headA.
        // Thêm các nút vào set.
        while(headA!=null ){
            set.add(headA);
            headA = headA.next;
        }
        // Duyệt qua danh sách liên kết headA.
        // Mỗi lần lặp, kiểm tra xem nút có tồn tại trong set không.
        // Nếu có, tức là nút hiện tại của headB là điểm giao nhau -> trả về nút hiện tại của headB, nếu sau khi duyệt hết mà không có nút nào tồn tại trong set, tức là 2 danh sách ko giao nhau, trả về null
        while(headB!=null){
            if(set.contains(headB)){
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }
    // Time complexity: O(n);
}
