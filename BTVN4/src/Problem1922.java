public class Problem1922 {

//    https://leetcode.com/problems/count-good-numbers/submissions/972345189/

    static final long mod = (long) (Math.pow(10, 9) + 7);
    public int countGoodNumbers(long n) {
        long evenPosition = (n + 1)/ 2;
        long oddPosition = n / 2;
        return (int)((recur(5, evenPosition) * recur(4, oddPosition)) % mod);

    }

    long recur(long x, long y){
        if(y == 0) return 1;
        long temp = recur(x, y / 2);
//        để y - 1 sẽ dẫn đến hiện tượng tràn bộ nhớ
//        y/ 2 là vì x ^ y = x^(y/2) * x^(y/2)
//        Nếu y là số lẻ thì đưa về dạng x * x^((y-1)/2) * x^((y-1)/2);
//        Nếu y là số chẵn thì kết quả x^(y/2) * x^(y/2);
        return (temp * temp * (y % 2 == 0 ? 1 : x)) % mod;
    }
}
