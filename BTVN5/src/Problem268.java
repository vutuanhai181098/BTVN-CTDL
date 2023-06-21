import java.util.Arrays;

public class Problem268 {

//    https://leetcode.com/problems/missing-number/submissions/976519937/

    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i <= nums.length ; i++){
            int idx = binarySearch(nums, i);
            if(idx == -1) return i;
        }
        return -1;
    }
    int binarySearch(int[] nums, int key){
        int left = 0;
        int right = nums.length -1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] == key) return mid;
            else if(nums[mid] > key) right = mid - 1;
            else left = mid + 1;
        }
        return -1;
    }


//    public int missingNumber(int[] nums) {
//        int sum1 = 0;
//        int n = nums.length;
//        // total sum the elements in array nums;
//        for(int i : nums){
//            sum1 += i;
//        }
//
//        // total sum the elements in [0,n];
//        int sum2 = (n*(n+1))/2;
//        return sum2-sum1;
//    }



}
