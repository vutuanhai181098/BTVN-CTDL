public class Problem1816 {


//    https://leetcode.com/problems/truncate-sentence/submissions/960740697/

    public String truncateSentence(String s, int k) {
        int count = 0;
        String str = "";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' ') count++;
            if(count == k) break;
            str += s.charAt(i);
        }
        return str;
    }
}
