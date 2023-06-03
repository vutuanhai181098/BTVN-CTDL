public class Problem344 {

//    https://leetcode.com/problems/reverse-string/submissions/960712452/

    public void reverseString(char[] s) {
        int x = s.length -1;
        for(int i = 0; i < s.length/2; i++){
            char c = s[i];
            s[i] = s[x];
            s[x] = c;
            x--;
        }
    }
}
