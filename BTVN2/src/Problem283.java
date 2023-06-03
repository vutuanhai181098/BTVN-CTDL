public class Problem283 {

//    https://leetcode.com/problems/move-zeroes/submissions/959128482/

    public void moveZeroes(int[] nums) {
        int x = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int n = nums[i];
                nums[i] = 0;
                nums[x] = n;
                x++;
            }
        }
    }
}
