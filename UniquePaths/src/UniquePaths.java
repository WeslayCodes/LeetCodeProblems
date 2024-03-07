/**
 * UniquePaths.java
 *
 * Calculates the number of unique paths for an empty grid.
 * Start at top left, end at bottom right.
 * Solved using combinational logic.
 */
class UniquePaths {
    public int uniquePaths(int m, int n) {
        if (m == 1 || n == 1) {
            return 1;
        }

        m--;
        n--;

        // Swap if n is greater to ensure combination properly calculated
        if (m < n) {
            m = m + n;
            n = m - n;
            m = m - n;
        }

        long result = 1;

        // Combinational logic
        for (int i=m+1, j=1; i<=m+n; i++, j++) {
            result *= i;
            result /= j;
        }

        return (int) result;
    }
}

/**
 * UniquePaths.java
 *
 * Calculates the number of unique paths for an empty grid.
 * Start at top left, end at bottom right.
 * Solved using Dynamic Programming.
 */
//class UniquePaths {
//    public int uniquePaths(int m, int n) {
//        int[][] grid = new int[m][n];
//
//        for (int i=0; i<m; i++) {
//            for (int j=0; j<n; j++) {
//                if (i == 0) {
//                    grid[0][j] = 1;
//                    continue;
//                }
//
//                if (j == 0) {
//                    grid[i][0] = 1;
//                    continue;
//                }
//
//                grid[i][j] = grid[i-1][j] + grid[i][j-1];
//            }
//        }
//
//        return grid[m-1][n-1];
//    }
//}