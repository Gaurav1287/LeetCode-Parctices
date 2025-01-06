class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] result = new int[n];

        // Left-to-right pass
        int operations = 0;
        int balls = 0;
        for (int i = 0; i < n; i++) {
            result[i] += operations;
            balls += boxes.charAt(i) - '0';
            operations += balls;
        }

        // Right-to-left pass
        operations = 0;
        balls = 0;
        for (int i = n - 1; i >= 0; i--) {
            result[i] += operations;
            balls += boxes.charAt(i) - '0';
            operations += balls;
        }

        return result;
    }
}