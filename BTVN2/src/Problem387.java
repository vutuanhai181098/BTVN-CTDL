public class Problem387 {

//    https://leetcode.com/problems/first-unique-character-in-a-string/submissions/960658586/

    public int firstUniqChar(String s) {
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(s.indexOf(c) == s.lastIndexOf(s.charAt(i))) return i;
        }
        return -1;
    }
}
