class Solution {
    public int projectionArea(int[][] grid) {
        int n = grid.length;

        int top = 0;
        int front = 0;
        int side = 0;

        for (int i = 0; i < n; i++) {
            int rowMax = 0;
            int colMax = 0;

            for (int j = 0; j < n; j++) {
                // Top view
                if (grid[i][j] > 0) {
                    top++;
                }

                // Front view (row max)
                rowMax = Math.max(rowMax, grid[i][j]);

                // Side view (column max)
                colMax = Math.max(colMax, grid[j][i]);
            }

            front += rowMax;
            side += colMax;
        }

        return top + front + side;
    }
}
