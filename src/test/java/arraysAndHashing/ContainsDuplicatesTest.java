package arraysAndHashing;

import arraysAndHashing.containsDuplicates.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ContainsDuplicatesTest {

    @Test
    void testContainsDuplicates1() {
        Solution solution = new Solution();
        assertTrue(solution.containsDuplicates(new int[]{1, 2, 3, 1}));
    }

    @Test
    void testContainsDuplicates2() {
        Solution solution = new Solution();
        assertFalse(solution.containsDuplicates(new int[]{1, 2, 3, 4}));
    }

    @Test
    void testContainsDuplicates3() {
        Solution solution = new Solution();
        assertTrue(solution.containsDuplicates(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
    }

    @Test
    void testContainsDuplicates4() {
        Solution solution = new Solution();
        assertTrue(solution.containsDuplicates(new int[]{1, 10, 200, 3, 200, 10000, 768910}));
    }
}