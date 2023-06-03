public class Problem88 {

// https://leetcode.com/problems/merge-sorted-array/submissions/962840563/

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = 0; i < n; i++){
            nums1[i + m] = nums2[i];
        }
        Arrays.sort(nums1);
    }
}
