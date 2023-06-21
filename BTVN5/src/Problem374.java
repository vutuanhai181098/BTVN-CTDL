public class Problem374 {

//    https://leetcode.com/problems/guess-number-higher-or-lower/submissions/974256324/

    /**
     * Forward declaration of guess API.
     * @param  num   your guess
     * @return 	     -1 if num is higher than the picked number
     *			      1 if num is lower than the picked number
     *               otherwise return 0
     * int guess(int num);
     */

    public class Solution extends GuessGame {
        public int guessNumber(int n) {
            return binarySearch(1, n);
        }
        int binarySearch(int left, int right){
            if(left > right) return -1;
            int mid = left + (right - left) / 2;
            if(guess(mid) == 0) return mid;
            if(guess(mid) == 1) left = mid + 1;
            else right = mid - 1;
            return binarySearch(left, right);
        }
    }
}
