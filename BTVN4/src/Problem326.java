public class Problem326 {

//    https://leetcode.com/problems/power-of-three/submissions/968983715/

    public boolean isPowerOfThree(int n) {
        if(n == 1) return true;
        if(n % 3 != 0 || n <= 0) return false;
        return isPowerOfThree(n/3);
    }
}
