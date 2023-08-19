import java.util.HashSet;
import java.util.Set;

public class Problem1748 {

//    https://leetcode.com/problems/sum-of-unique-elements/submissions/1025662518/

    // public int sumOfUnique(int[] nums) {
    //     // Tạo 1 mảng lưu trữ số lần xuất hiên của mỗi phần tử trong nums
    //     int[] arr = new int[101];
    //     for(int num : nums){
    //         arr[num]++;
    //     }
    //     // Tạo biến res lưu kết quả
    //     // Lặp qua arr, nếu tại vị trí i trong mảng có giá trị = 1, cộng vào sum.
    //     int sum = 0;
    //     for(int i = 1; i < arr.length; i++){
    //         if(arr[i] == 1){
    //             sum += i;
    //         }
    //     }
    //     return sum;
    //     // Time complexity: O(n);
    //     // Space complexity: O(1);
    // }

    public int sumOfUnique(int[] nums) {
        // Tạo set để lưu trữ các phần tử duy nhất trong nums.
        Set<Integer> unique = new HashSet<>();
        // Mảng để đánh dấu xem phần tử đã xuất hiện trước đó trong nums hay chưa?
        boolean[] arr = new boolean[101];
        int sum = 0;
        for(int num: nums){
            /*
                -Nếu arr[num] là false, tức là num chưa xuất hiện trước đó.
                -Nếu đúng, add(num) vào trong unique.
                -Nếu num chưa có trong unique, add(num) trả về true,cộng num vào sum.
                -Ngược lại, num đã có trong unique, add(num) trả về false, đánh dấu
                vào mảng arr[num] = true, trừ đi num từ sum.
                -Nếu arr[num] là true, tức là num đã xuất hiện trước đó và đã được đánh dấu là
                phần tử trùng lặp, không thực hiện gì và tiếp tục vòng lặp.
            */
            if(arr[num] == false){
                if(unique.add(num)){
                    sum += num;
                } else {
                    arr[num] = true;
                    sum -= num;
                }
            }
        }
        return sum;
        // Time complexity: O(n);
        // Space complexity: O(1);
    }
}
