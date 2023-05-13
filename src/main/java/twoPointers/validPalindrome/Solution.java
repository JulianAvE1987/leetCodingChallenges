package twoPointers.validPalindrome;

public class Solution {

    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int stringLength = s.length();
        int halfStringLength = stringLength / 2;
        char[] charArr = s.toCharArray();

        for (int i = 0; i < halfStringLength; i++) {
            if (charArr[i] != charArr[stringLength - i - 1]) {
                return false;
            }
        }
        return true;
    }

    public boolean testTest(String s) {
        StringBuilder sB = new StringBuilder();
        sB.append(s);
        return s.equals(sB.reverse().toString());
    }
}