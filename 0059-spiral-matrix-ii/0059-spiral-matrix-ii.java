class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int num = 1;
        int rows = 0, rowend = n - 1, cols = 0, colend = n - 1;

        while (rows <= rowend && cols <= colend) {
            // Fill top row
            for (int i = cols; i <= colend; i++) {
                matrix[rows][i] = num++;
            }
            rows++;

            // Fill right column
            for (int i = rows; i <= rowend; i++) {
                matrix[i][colend] = num++;
            }
            colend--;

            // Fill bottom row (if applicable)
            if (rows <= rowend) {
                for (int i = colend; i >= cols; i--) {
                    matrix[rowend][i] = num++;
                }
                rowend--;
            }

            // Fill left column (if applicable)
            if (cols <= colend) {
                for (int i = rowend; i >= rows; i--) {
                    matrix[i][cols] = num++;
                }
                cols++;
            }
        }
        return matrix;
    }
}