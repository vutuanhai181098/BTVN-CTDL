public class Problem1859 {

//    https://leetcode.com/problems/sorting-the-sentence/submissions/967619085/

    public String sortSentence(String s) {
        String[] strs = s.split(" ");
        String[] newStrs = new String[strs.length];
        int idx = 0;
        for (String str: strs) {
            idx = (int)(str.charAt(str.length() - 1) - '0');
            newStrs[idx - 1] = str.substring(0, str.length() - 1);
        }
        StringBuilder sb = new StringBuilder();
        for (String str: newStrs
        ) {
            sb.append(str).append(" ");
        }
        return sb.toString().trim();
    }
}
