package arraysAndHashing;

import org.junit.jupiter.api.Test;
import arraysAndHashing.validAnagram.Solution;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidAnagramTest {

    @Test
    void testValidAnagram1() {
        Solution solution = new Solution();
        assertTrue(solution.isAnagram("anagram", "nagaram"));
    }

    @Test
    void testValidAnagram2() {
        Solution solution = new Solution();
        assertFalse(solution.isAnagram("rat", "car"));
    }

    @Test
    void testValidAnagram3() {
        Solution solution = new Solution();
        assertFalse(solution.isAnagram("abcd", "ef"));
    }

    @Test
    void testValidAnagram4() {
        Solution solution = new Solution();
        assertFalse(solution.isAnagram("", "a"));
    }
}