class Solution {
    public long gridGame(int[][] grid) {
      int n = grid[0].length;
        long totalTop = 0, totalBottom = 0;
        for (int i = 0; i < n; i++) {
            totalTop += grid[0][i];
            totalBottom += grid[1][i];
        }

        long minPointsForSecondRobot = Long.MAX_VALUE;
        long bottomSum = 0; 

        for (int i = 0; i < n; i++) {
            totalTop -= grid[0][i];
            long pointsForSecond = Math.max(totalTop, bottomSum);
            minPointsForSecondRobot = Math.min(minPointsForSecondRobot,           pointsForSecond);
            bottomSum += grid[1][i];
        }

        return minPointsForSecondRobot;  
    }
}