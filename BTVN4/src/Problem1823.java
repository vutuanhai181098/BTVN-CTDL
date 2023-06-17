public class Problem1823 {
//    https://leetcode.com/problems/find-the-winner-of-the-circular-game/submissions/973028062/

    public int findTheWinner(int n, int k) {
        return recur(n,k) + 1;
    }
    int recur(int n, int k){
        if(n == 1) return 0;
//        Nếu n = 1 tức là chỉ còn lại 1 người chơi nên trả về chỉ số 0;
//        Nếu n > 1 thì gọi  hàm recur để tìm chỉ số người chiến thắng trong trường hợp ít đi 1 người,
//        sau đó + k để ra chỉ số của người bị loại trước đó. chia lấy dư cho n để đảm bảo trường hợp kết quả > n;
        return (recur(n-1,k) + k) % n;
    }
}
