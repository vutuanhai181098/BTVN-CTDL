public class Problem509 {
//    https://leetcode.com/problems/fibonacci-number/submissions/988966188/

    public int fib(int n) {
        int i = 0;
        int j = 1;
        int ans = 0;
        for(int k = 2; k <=n; k++){
            ans = i + j;
            i = j;
            j = ans;
        }
        return n == 0 || n == 1 ? n : ans;
    }
    // Time complexity = O(n)
}
