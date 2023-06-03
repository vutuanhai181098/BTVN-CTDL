public class Problem27 {

//    https://leetcode.com/problems/remove-element/submissions/962848578/

    public int removeElement(int[] nums, int val) {
        int idx = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[idx++] = nums[i];
            }
        }
        return idx;
    }
}
