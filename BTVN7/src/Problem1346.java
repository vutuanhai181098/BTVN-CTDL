import java.util.Arrays;

public class Problem1346 {

//    https://leetcode.com/problems/check-if-n-and-its-double-exist/submissions/989098239/

    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            int ans = binarySearch(arr, arr[i] * 2, 0 , arr.length - 1);
            if(ans != -1 && ans != i) return true;
        }
        return false;
    }
    int binarySearch(int[] arr, int n, int l, int r){
        while(l <= r){
            int mid = l + (r-l)/2;
            if(arr[mid] == n) return mid;
            if(arr[mid] > n) r = mid -1;
            else l = mid + 1;
        }
        return -1;
    }
    // Time complexity : O(nlogn)
    // Space complexity: O(n)
}
