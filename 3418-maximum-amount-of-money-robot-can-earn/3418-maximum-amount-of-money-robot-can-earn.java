class Solution {
    public int maximumAmount(int[][] coins) {
        int n = coins.length;
        int m = coins[0].length;
        int k = 2; 
        int dp[][][] = new int[n][m][k + 1];

        for (int[][] layer : dp) {
            for (int[] row : layer) {
                Arrays.fill(row,Integer.MIN_VALUE);
            }
        }
        return solve(coins,dp,n-1,m-1,k);
    }
    public int solve(int[][] coins, int[][][] dp, int i, int j, int rem) {
        if (i < 0 || j < 0) return Integer.MIN_VALUE;
        if (i == 0 && j == 0) {
            if (coins[i][j] < 0 && rem > 0) return 0;
            return coins[i][j];
        }
        if (dp[i][j][rem]!=Integer.MIN_VALUE) return dp[i][j][rem];

        int take = coins[i][j] + Math.max(
            solve(coins, dp, i - 1, j, rem),
            solve(coins, dp, i, j - 1, rem)
        );
        int skip = Integer.MIN_VALUE;
        if (coins[i][j] < 0 && rem > 0) {
            skip = Math.max(
                solve(coins, dp, i - 1, j, rem - 1),
                solve(coins, dp, i, j - 1, rem - 1)
            );
        }

        return dp[i][j][rem] = Math.max(take, skip);
    }
}