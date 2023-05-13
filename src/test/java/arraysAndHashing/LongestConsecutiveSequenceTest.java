package arraysAndHashing;

import arraysAndHashing.longestConsecutiveSequence.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestConsecutiveSequenceTest {

    @Test
    public void testLongestConsecutiveSequence1() {
        Solution solution = new Solution();
        assertEquals(solution.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}), 4);
    }

    @Test
    public void testLongestConsecutiveSequence2() {
        Solution solution = new Solution();
        assertEquals(solution.longestConsecutive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1}), 9);
    }
}