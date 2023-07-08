import java.util.Arrays;

public class Problem561 {

//    https://leetcode.com/problems/array-partition/submissions/983599325/

    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        // Chia mảng thành từng cặp phần tử,tính tổng các giá trị nhỏ nhất của từng cặp
        for(int i = 0; i < nums.length; i+=2){
            sum += nums[i];
        }
        return sum;
    }
}
