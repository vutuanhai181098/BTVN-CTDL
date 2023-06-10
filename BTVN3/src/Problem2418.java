import java.util.Map;
import java.util.TreeMap;

public class Problem2418 {

//    https://leetcode.com/problems/sort-the-people/submissions/963410167/

    public String[] sortPeople(String[] names, int[] heights) {
        int n = heights.length;
        Map<Integer, String> map = new TreeMap<>();
        for(int i = 0; i < n; i++){
            map.put(heights[i], names[i]);
        }
        int idx = n - 1;
        for(String str : map.values()){
            names[idx--] = str;
        }
        return names;
    }
}
