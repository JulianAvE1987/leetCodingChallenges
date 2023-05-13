package arraysAndHashing;

import arraysAndHashing.productExceptSelf.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ProductExceptSelfTest {

    @Test
    void testProductExceptSelf1() {
        Solution solution = new Solution();
        assertArrayEquals(new int[]{24, 12, 8, 6}, solution.productExceptSelf(new int[]{1, 2, 3, 4}));
    }

    @Test
    void testProductExceptSelf2() {
        Solution solution = new Solution();
        assertArrayEquals(new int[]{0, 0, 9, 0, 0}, solution.productExceptSelf(new int[]{-1, 1, 0, -3, 3}));
    }
}