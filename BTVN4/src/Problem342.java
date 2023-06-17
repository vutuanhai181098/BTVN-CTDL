public class Problem342 {

//    https://leetcode.com/problems/power-of-four/submissions/970771224/

    public boolean isPowerOfFour(int n) {
        if(n == 1) return true;
        else if(n % 4 != 0 || n < 4) return false;
        return isPowerOfFour(n/4);
    }
}
