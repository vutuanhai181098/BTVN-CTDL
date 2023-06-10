import java.util.Arrays;

public class Problem1051 {

//    https://leetcode.com/problems/height-checker/submissions/967512869/

    public int heightChecker(int[] heights) {
        int n = heights.length;
        int[] arr = Arrays.copyOf(heights, n);
        Arrays.sort(arr);
        int count = 0;
        for(int i = 0; i < n; i++){
            if(heights[i] != arr[i]) count++;
        }
        return count;
    }
}
