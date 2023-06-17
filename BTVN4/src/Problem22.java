import java.util.ArrayList;
import java.util.List;

public class Problem22 {

//    https://leetcode.com/problems/generate-parentheses/submissions/973061267/

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        recur(result, "", 0, 0, n);
        return result;
    }
    void recur(List<String> result, String str, int open, int close, int n){
//        Nếu độ dài của chuỗi bằng với số ngoặc cần tạo thì thêm phần tử vào list.
        if(str.length() == 2 * n){
            result.add(str);
            return;
        }

//        Nếu số ngoặc mở chưa đạt đến giới hạn, thêm ngoặc mở vào chuỗi , gọi lại hàm.
        if(open < n){
            recur(result, str + "(", open + 1, close, n);
        }

//        Nếu số ngoặc đóng chưa đạt đến giới hạn, thêm ngoặc đóng vào chuỗi , gọi lại hàm.
        if(close < open){
            recur(result, str + ")", open, close + 1, n);
        }
    }
}
