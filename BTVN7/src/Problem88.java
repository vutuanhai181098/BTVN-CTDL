public class Problem88 {
//    https://leetcode.com/problems/merge-sorted-array/submissions/989018269/

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = nums1.length - 1;

        while(j >= 0){
            if(i >= 0 && nums1[i] > nums2[j]){
                nums1[k--] = nums1[i--];
            } else nums1[k--] = nums2[j--];
        }
    }
    // Time complexity: O(m+n) lặp qua cả 2 mảng.
    // Space complexity: O(1)
}
