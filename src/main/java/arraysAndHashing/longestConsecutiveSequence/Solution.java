package arraysAndHashing.longestConsecutiveSequence;

import java.util.HashSet;

public class Solution {

    public int longestConsecutive(int[] nums) {
        int result = 0;
        int numsLength = nums.length;
        HashSet<Integer> numSet = new HashSet<>();

        for (int i = 0; i < numsLength; i++) {
            numSet.add(nums[i]);
        }

        for (int i = 0; i < numsLength; i++) {
            int possibleLength = 1;
            int preValue = nums[i] - 1;

            while(numSet.contains(preValue)) {
                numSet.remove(preValue--);
                possibleLength++;
            }

            int postValue = nums[i] + 1;
            while(numSet.contains(postValue)) {
                numSet.remove(postValue++);
                possibleLength++;
            }
            result = Math.max(result, possibleLength);
        }

        return result;
    }
}