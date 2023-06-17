public class Problem344 {

//    https://leetcode.com/problems/reverse-string/submissions/968058408/

    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        recur(left, right, s);
    }
    public void recur(int left, int right, char[] s){
        if(left > right) return;
        char ch = s[left];
        s[left] = s[right];
        s[right] = ch;
        recur(++left, --right, s);
    }
}
