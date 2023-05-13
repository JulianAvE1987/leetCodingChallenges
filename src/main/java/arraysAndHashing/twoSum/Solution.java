package arraysAndHashing.twoSum;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        int[] indexOfSum = new int[2];

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                indexOfSum = new int[]{map.get(target - nums[i]), i};
                break;
            }
            map.put(nums[i], i);
        }
        return indexOfSum;
    }
}