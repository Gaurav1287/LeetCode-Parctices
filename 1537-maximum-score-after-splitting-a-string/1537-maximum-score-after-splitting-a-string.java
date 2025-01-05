class Solution {
    public int maxScore(String s) {
        int totalOnes = 0;
        int leftZeros = 0;
        int maxScore = Integer.MIN_VALUE;
        for (char c : s.toCharArray()) {
            if (c == '1') totalOnes++;
        }

        int currentOnes = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') {
                leftZeros++;
            } else {
                currentOnes++;
            }

           
            int rightOnes = totalOnes - currentOnes;

           
            maxScore = Math.max(maxScore, leftZeros + rightOnes);
        }

        return maxScore;
    }
}