class UniquePaths2 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int height = obstacleGrid.length;
        int width = obstacleGrid[0].length;

        int[][] paths = new int[height][width]; // Used for Dynamic Programming

        // Obtains initial values for first column
        for (int i=0; i<height; i++) {
            if (obstacleGrid[i][0] != 0) {
                break;
            }

            paths[i][0] = 1;
        }

        // Obtains initial values for first row
        for (int j=0; j<width; j++) {
            if (obstacleGrid[0][j] != 0) {
                break;
            }

            paths[0][j] = 1;
        }

        // Utilizes Dynamic Programming to calculate number of paths
        for (int i=1; i<height; i++) {
            for (int j=1; j<width; j++) {
                if (obstacleGrid[i][j] == 0) {
                    paths[i][j] = paths[i-1][j] + paths[i][j-1];
                }
            }
        }

        return paths[height-1][width-1];
    }
}