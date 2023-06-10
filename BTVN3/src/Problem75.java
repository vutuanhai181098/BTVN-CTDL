public class Problem75 {

//    https://leetcode.com/problems/sort-colors/submissions/967731030/

    public void sortColors(int[] nums) {
//        use insertion sort.
        for(int i = 1; i < nums.length; i++){
            int key = nums[i];
            int j = i -1;
            while(j>= 0 && nums[j] > key){
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }
    }
}
