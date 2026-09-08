class Solution {
    public long minCost(int m, int n, int[][] waitCost) {
        long[][] dp = new long[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                long entry = (long)(i + 1) * (j + 1);
                // Starting cell
                if (i == 0 && j == 0) {
                    dp[i][j] = entry;
                    continue;
                }

                long prev = Long.MAX_VALUE;
                
                if (i > 0) {
                    prev = Math.min(prev, dp[i - 1][j]);
                }

                if (j > 0) {
                    prev = Math.min(prev, dp[i][j - 1]);
                }

                dp[i][j] = prev + entry;

                // We must wait before making the next move.
                // But don't wait at destination.
                if (i != m - 1 || j != n - 1) {
                    dp[i][j] += waitCost[i][j];
                }
            }
        }
        return dp[m - 1][n - 1];
    }
}