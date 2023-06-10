public class Problem389 {

//    https://leetcode.com/problems/find-the-difference/submissions/967729242/

    public char findTheDifference(String s, String t) {

//        use charset Ascii.

        int result = 0;
        for(int i = 0; i < s.length(); i++){
            result = result + t.charAt(i) - s.charAt(i);
        }
        result += t.charAt(t.length() - 1);
        return (char) result;
    }
}
