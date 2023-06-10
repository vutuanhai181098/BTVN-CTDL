import java.util.Arrays;

public class Problem2389 {

//    https://leetcode.com/problems/longest-subsequence-with-limited-sum/submissions/967758141/

    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int[] arr = new int[queries.length];

        for(int i = 0; i < queries.length; i++){
            int n = queries[i];
            int sum = 0;
            int count= 0;
            for(int j = 0; j < nums.length; j++){
                sum += nums[j];
                if(sum > n) break;
                count++;
            }
            arr[i] = count;
        }
        return arr;
    }
}
