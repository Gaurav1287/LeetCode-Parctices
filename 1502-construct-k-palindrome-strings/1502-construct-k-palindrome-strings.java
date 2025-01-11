class Solution {
    public boolean canConstruct(String s, int k) {
        if (k > s.length()) return false;

        // Count the frequency of each character
        int[] charCount = new int[26];
        for (char c : s.toCharArray()) {
            charCount[c - 'a']++;
        }

        // Count how many characters have an odd frequency
        int oddCount = 0;
        for (int count : charCount) {
            if (count % 2 != 0) {
                oddCount++;
            }
        }

        // If the number of odd frequencies is greater than k, return false
        return oddCount <= k;
    }
}