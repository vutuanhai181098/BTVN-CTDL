public class Problem709 {
//    https://leetcode.com/problems/to-lower-case/submissions/988970221/

    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            sb.append(ch >= 'A' && ch <= 'Z' ? (char)(ch + 32) : ch);
        }
        return sb.toString();
    }
    // Time Complexity : O(n) n là độ dài của chuỗi
}