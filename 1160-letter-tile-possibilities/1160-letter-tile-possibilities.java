class Solution {
    public int numTilePossibilities(String tiles) {
         int[] freq = new int[26]; // Frequency array for letters A-Z
        
        // Count occurrences of each letter
        for (char c : tiles.toCharArray()) {
            freq[c - 'A']++;
        }
        
        // Start backtracking
        return backtrack(freq);
    }

    private int backtrack(int[] freq) {
        int count = 0;
        
        // Try using each letter
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {  // If the letter is available
                count++; // Count this sequence
                
                freq[i]--; // Use this letter
                count += backtrack(freq); // Recursive call for next choices
                freq[i]++; // Backtrack (restore the letter)
            }
        }
        
        return count;
    }
}