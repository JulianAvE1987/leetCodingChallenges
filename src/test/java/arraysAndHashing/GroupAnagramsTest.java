package arraysAndHashing;

import arraysAndHashing.groupAnagrams.Solution;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertSame;

class GroupAnagramsTest {

    @Test
    void testGroupAnagrams1() {
        Solution solution = new Solution();
        List<String> element1 = Arrays.asList("bat");
        List<String> element2 = Arrays.asList("nat","tan");
        List<String> element3 = Arrays.asList("ate","eat","tea");
        List<List<String>> result = new ArrayList<>();
        result.add(element1);
        result.add(element2);
        result.add(element3);
        assertSame(solution.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}), result);
    }
}