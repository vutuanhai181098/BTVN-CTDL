public class Problem1221 {

//    https://leetcode.com/problems/split-a-string-in-balanced-strings/submissions/962874873/

    public int balancedStringSplit(String s) {
        int x = 0;
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'R') x++;
            else x--;
            if(x == 0) count++;
        }
        return count;
    }
}
