public class Problem724 {

//    https://leetcode.com/problems/find-pivot-index/submissions/960767129/

    public int pivotIndex(int[] nums) {
        int sumLeft = 0;
        int sumRight = 0;
        for(int i : nums){
            sumRight += i;
        }
        for(int i = 0; i < nums.length; i++){
            sumRight -= nums[i];
            if(sumLeft == sumRight) return i;
            sumLeft += nums[i];
        }
        return -1;
    }
}
