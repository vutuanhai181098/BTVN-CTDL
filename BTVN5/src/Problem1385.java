import java.util.Arrays;

public class Problem1385 {

//    https://leetcode.com/problems/find-the-distance-value-between-two-arrays/submissions/974241710/

    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
//        |a - b| <= c --> a-c <= b <= a + c

        Arrays.sort(arr2);
        int count = 0;
        for(int i : arr1){
            if(binarySearch(arr2, 0, arr2.length - 1, i - d, i + d) == -1) count++;
        }
        return count;
    }
    int binarySearch(int[] nums, int left, int right, int from, int to){
        if(left > right) return -1;

        int mid = (left+right)/2;
        if(nums[mid] >= from && nums[mid] <= to) return mid;
        if(nums[mid] < from) left = mid + 1;
        if(nums[mid] > to) right = mid - 1;

        return binarySearch(nums, left, right, from, to);
    }
}
