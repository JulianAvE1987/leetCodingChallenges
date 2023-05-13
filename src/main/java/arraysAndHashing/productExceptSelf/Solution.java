package arraysAndHashing.productExceptSelf;

import java.util.Arrays;

public class Solution {

    public int[] productExceptSelf(int[] nums) {
        int numsLength = nums.length;
        int[] result = new int[numsLength];
        Arrays.fill(result, 1);

        int product = 1;
        for (int i = 0; i < numsLength; i++) {
            result[i] *= product;
            product *= nums[i];
        }

        product = 1;
        for (int i = numsLength - 1; i >= 0; i--) {
            result[i] *= product;
            product *= nums[i];
        }

        return result;
    }
}