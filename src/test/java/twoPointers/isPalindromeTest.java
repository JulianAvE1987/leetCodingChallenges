package twoPointers;

import org.junit.jupiter.api.Test;
import twoPointers.validPalindrome.Solution;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class isPalindromeTest {

    @Test
    void testIsPalindrome1() {
        Solution solution = new Solution();
        assertTrue(solution.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    void testIsPalindrome2() {
        Solution solution = new Solution();
        assertFalse(solution.isPalindrome("race a car"));
    }

    @Test
    void testIsPalindrome3() {
        Solution solution = new Solution();
        assertTrue(solution.isPalindrome(" "));
    }
}