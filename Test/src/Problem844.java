import java.util.Stack;

public class Problem844 {
//    https://leetcode.com/problems/backspace-string-compare/submissions/1025705307/

    public boolean backspaceCompare(String s, String t) {
        // Khởi tạo 2 ngăn xếp stack1 và stack2 để lưu trữ các ký tự từ chuỗi s và chuỗi t.
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        // Duyệt qua mỗi chuỗi, với mỗi ký tự c:
        // Nếu c khác '#', đẩy c vào stack.
        // Nếu c là '#', và stack không rỗng, loại bỏ phần tử đầu tiên của stack.
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c != '#'){
                stack1.push(c);
            } else if(!stack1.isEmpty() && c == '#'){
                stack1.pop();
            }
        }
        for(int i = 0; i < t.length(); i++){
            char c = t.charAt(i);
            if(c != '#'){
                stack2.push(c);
            } else if(!stack2.isEmpty() && c == '#'){
                stack2.pop();
            }
        }
        // Phương thức equals() so sánh nội dung và thứ tự của các phần tử trong ngăn xếp.
        // Nếu nội dung và thứ tự của 2 ngăn xếp giống nhau -> trả về true,
        // ngược lại -> trả về false.
        return stack1.equals(stack2);

        // Time complexity: O(n);
    }
}
