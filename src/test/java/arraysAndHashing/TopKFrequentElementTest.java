package arraysAndHashing;

import arraysAndHashing.topKFrequentElements.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TopKFrequentElementTest {

    @Test
    void testTopKFrequentElement1() {
        Solution solution = new Solution();
        assertArrayEquals(new int[]{1, 2}, solution.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2));
    }

    @Test
    void testTopKFrequentElement2() {
        Solution solution = new Solution();
        assertArrayEquals(new int[]{1}, solution.topKFrequent(new int[]{1}, 1));
    }
}