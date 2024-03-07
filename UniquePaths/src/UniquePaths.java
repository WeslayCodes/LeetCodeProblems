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

        if (m < n) {
            m = m + n;
            n = m - n;
            m = m - n;
        }

        long result = 1;

        for (int i=m+1, j=1; i<=m+n; i++, j++) {
            result *= i;
            result /= j;
        }

        return (int) result;
    }
}