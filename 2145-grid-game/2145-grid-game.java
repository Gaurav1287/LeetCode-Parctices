class Solution {
    public long gridGame(int[][] grid) {
      int n = grid[0].length;

        // Calculate the total sum for the top and bottom rows
        long totalTop = 0, totalBottom = 0;
        for (int i = 0; i < n; i++) {
            totalTop += grid[0][i];
            totalBottom += grid[1][i];
        }

        long minPointsForSecondRobot = Long.MAX_VALUE;
        long bottomSum = 0; // Tracks points collected in the bottom row so far

        for (int i = 0; i < n; i++) {
            // Remove the current cell from the top total
            totalTop -= grid[0][i];

            // The second robot's maximum points
            long pointsForSecond = Math.max(totalTop, bottomSum);

            // Update the minimum points the first robot can leave for the second
            minPointsForSecondRobot = Math.min(minPointsForSecondRobot, pointsForSecond);

            // Add the current cell to the bottom sum
            bottomSum += grid[1][i];
        }

        return minPointsForSecondRobot;  
    }
}