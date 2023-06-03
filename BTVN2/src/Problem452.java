import java.util.Arrays;
import java.util.Comparator;

public class Problem452 {

//    https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/submissions/962833717/

    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] row1, int[] row2) {
                return row1[1] > row2[1] ? 1 : -1;
            }
        });
        int count = 1;
        int[] nums = points[0];
        for(int i = 1; i < points.length; i++){
            if(points[i][0] > nums[1]){
                count++;
                nums = points[i];
            }
        }
        return count;
    }
}
