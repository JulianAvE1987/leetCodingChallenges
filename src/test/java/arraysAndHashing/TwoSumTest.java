package arraysAndHashing;

import org.junit.jupiter.api.Test;
import arraysAndHashing.twoSum.Solution;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void testTwoSum1() {
        Solution solution = new Solution();
        assertArrayEquals(new int[]{0, 1}, solution.twoSum(new int[]{2, 7, 11, 15}, 9));
    }

    @Test
    void testTwoSum2() {
        Solution solution = new Solution();
        assertArrayEquals(new int[]{1, 2}, solution.twoSum(new int[]{3, 2, 4}, 6));
    }

    @Test
    void testTwoSum3() {
        Solution solution = new Solution();
        assertArrayEquals(new int[]{0, 1}, solution.twoSum(new int[]{3, 3}, 6));
    }
}