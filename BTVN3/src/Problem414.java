public class Problem414 {

//    https://leetcode.com/problems/third-maximum-number/submissions/967593277/

    public int thirdMax(int[] nums) {
        long firstMax = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;

        for(int i : nums){
            if(i > firstMax){
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = i;
            } else if(i < firstMax && i > secondMax){
                thirdMax = secondMax;
                secondMax = i;
            } else if(i < secondMax && i > thirdMax){
                thirdMax = i;
            }
        }
        return (int)((thirdMax == Long.MIN_VALUE) ? firstMax : thirdMax);
    }
}
