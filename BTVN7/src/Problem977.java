public class Problem977 {
//    https://leetcode.com/problems/squares-of-a-sorted-array/submissions/989032452/

    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int left = 0, right = nums.length - 1, idx = nums.length - 1;
        while(left <= right){
            int iL = nums[left]*nums[left];
            int iR = nums[right]*nums[right];
            if(iL < iR){
                ans[idx--] = iR;
                right--;
            } else{
                ans[idx--] = iL;
                left++;
            }
        }
        return ans;
    }
    // Time complexity: O(n)
    // Space complexity: O(n)
}
