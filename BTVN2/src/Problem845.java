public class Problem845 {

//    https://leetcode.com/problems/longest-mountain-in-array/submissions/961645343/

    public int longestMountain(int[] arr) {
        if(arr.length < 3) return 0;
        int idx = 0;
        int length = 0;
        for(int i = 1; i < arr.length - 1; i++){
            if(arr[i-1] < arr[i] && arr[i] > arr[i+1]){
                idx = i;
                int n = lengthOfSubArray(arr, idx);
                length = Math.max(length, n);
            }
        }
        if(idx == 0) return 0;

        return length;
    }
    public int lengthOfSubArray(int[] arr, int idx){
        int length = 1;
        for(int i = idx; i > 0; i--){
            if(arr[i] > arr[i-1]){
                length++;
            } else break;
        }
        for(int i = idx; i < arr.length - 1; i++){
            if(arr[i] > arr[i+1]){
                length++;
            } else break;
        }
        return length;
    }
}
