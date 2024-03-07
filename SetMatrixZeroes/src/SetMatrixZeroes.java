/**
 * SetMatrixZeroes.java
 *
 * Sets columns and rows that include a zero to all zeroes.
 */
class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        boolean firstColZeroed = false; // Keeps track of if first column should be zeroed
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Loops through all values to find zeroes.
        // Stores zero in first value of column and row if they should be zeroed.
        // First column skipped in inner loop to avoid first row from being set to zero
        // if any zeroes are in the first column.
        for (int i=0; i<rows; i++) {
            if (matrix[i][0] == 0) {
                firstColZeroed = true;
            }

            for (int j=1; j<cols; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Loops backwards to set all values to zero if needed.
        // Grabs zero status from first value of column or row.
        // First column skipped in inner loop to avoid first row from being set to zero
        // if any zeroes are in the first column.
        for (int i=rows-1; i>=0; i--) {
            for (int j=cols-1; j>=1; j--) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }

            if (firstColZeroed) {
                matrix[i][0] = 0;
            }
        }
    }
}