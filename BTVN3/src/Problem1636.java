import java.util.*;

public class Problem1636 {

//    https://leetcode.com/problems/sort-array-by-increasing-frequency/submissions/967242779/

    public int[] frequencySort(int[] nums) {
        Arrays.sort(nums);
        Map<Integer, Integer> maps = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int count = 1;
            if(maps.get(nums[i]) != null) continue;
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j]) count++;
                else break;
            }
            maps.put(nums[i], count);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(maps.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>(){
            public int compare(Map.Entry<Integer, Integer> a, Map.Entry<Integer, Integer> b){
                int result = a.getValue().compareTo(b.getValue());
                if(result == 0){
                    result = b.getKey().compareTo(a.getKey());
                }
                return result;
            }
        });

        int idx = 0;
        for(Map.Entry<Integer, Integer> entry : list){
            for(int i = 0; i < entry.getValue(); i ++){
                nums[idx++] = entry.getKey();
            }
        }

        return nums;
    }
}
