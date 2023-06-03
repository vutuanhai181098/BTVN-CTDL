public class Problem1295 {

//    https://leetcode.com/problems/find-numbers-with-even-number-of-digits/submissions/958283869/

    public int findNumbers(int[] nums) {
        int result = 0;
        for(int i: nums){
            int count = 0;
            while(i != 0){
                count++;
                i /= 10;
            }
            if(count %2 == 0) result++;
        }
        return result;
    }
}
