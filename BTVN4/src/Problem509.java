public class Problem509 {

//    https://leetcode.com/problems/fibonacci-number/submissions/968047185/

    public int fib(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        return fib(n-1) + fib(n -2 );
    }
}
