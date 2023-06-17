public class Problem394 {

//    https://leetcode.com/problems/decode-string/submissions/972796524/

    int idx = 0;
    public String decodeString(String s) {
        StringBuilder str = new StringBuilder();
        int num = 0;
        while (idx < s.length()){
            char c = s.charAt(idx);
            if (Character.isDigit(c)){
                num = num * 10 + (c - '0');
            } else if (Character.isLetter(c)) {
                str.append(c);
            } else if (c == '[') {
                idx++;
                String temp = decodeString(s);
                for (int i = 0; i < num; i++) {
                    str.append(temp);
                }
                num = 0;
            } else if (c == ']') {
                break;
            }
            idx++;
        }
        return str.toString();
    }
}
