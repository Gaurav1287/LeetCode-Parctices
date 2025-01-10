class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
      List<String> result = new ArrayList<>();
        
        // Step 1: Calculate the maximum frequency of each character needed across all words in words2
        int[] maxFreq = new int[26];
        for (String word : words2) {
            int[] freq = getCharFrequency(word);
            for (int i = 0; i < 26; i++) {
                maxFreq[i] = Math.max(maxFreq[i], freq[i]);
            }
        }
        
        // Step 2: Check each word in words1
        for (String word : words1) {
            int[] freq = getCharFrequency(word);
            boolean isUniversal = true;
            for (int i = 0; i < 26; i++) {
                if (freq[i] < maxFreq[i]) {
                    isUniversal = false;
                    break;
                }
            }
            if (isUniversal) {
                result.add(word);
            }
        }
        
        return result;
    }

    // Helper function to calculate character frequency
    private int[] getCharFrequency(String word) {
        int[] freq = new int[26];
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }
        return freq;
    }
}