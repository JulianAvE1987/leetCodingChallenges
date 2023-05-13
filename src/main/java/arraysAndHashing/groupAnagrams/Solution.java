package arraysAndHashing.groupAnagrams;

import java.util.*;

public class Solution {

    public List<List<String>> groupAnagrams(String[] stringArray) {
        Map<String, ArrayList<String>> map = new HashMap<>();
        List<List<String>> result = new ArrayList<>();

        for (String stringElement : stringArray) {
            char[] cArr = stringElement.toCharArray();
            Arrays.sort(cArr);
            String sortedString = Arrays.toString(cArr);

            if (map.containsKey(sortedString)) {
                map.get(sortedString).add(stringElement);
            } else {
                ArrayList<String> stringArrayList = new ArrayList<>();
                stringArrayList.add(stringElement);
                map.put(sortedString, stringArrayList);
            }
        }

        for (String sortedStringKey : map.keySet()) {
            result.add(map.get(sortedStringKey));
        }
        return result;
    }
}