public class Problem1089 {

//    https://leetcode.com/problems/duplicate-zeros/submissions/962867220/

    public void duplicateZeros(int[] arr) {
        int[] nums= new int[arr.length];
        int idx = 0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] != 0){
                nums[idx] = arr[i];
                idx++;
            }
            else {
                nums[idx] = 0;
                if(idx + 1 < arr.length){
                    nums[idx + 1] = 0;
                }
                idx+=2;
            }
            if(idx >= arr.length) break;
        }
        for(int i = 0; i < arr.length; i++){
            arr[i] = nums[i];
        }
    }
}
