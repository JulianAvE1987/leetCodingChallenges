package arraysAndHashing.topKFrequentElements;

import java.util.*;

public class Solution {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[k];

        for (int i = 0; i < nums.length; i++) {
            map.putIfAbsent(nums[i], 0);
            map.put(nums[i], map.get(nums[i]) + 1);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        Collections.reverse(list);

        for (int i = 0; i < k; i++) {
            result[i] = list.get(i).getKey();
        }

        return result;
    }
}