class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        char[][] grid = new char[m][n];
        int ans = m * n;
        for(int[] g : guards) {
            grid[g[0]][g[1]] = 'G';
            ans--;
        }
        for(int[] w : walls) {
            grid[w[0]][w[1]] = 'W';
            ans--;
        }
        for(int[] g : guards) {
            for(int i=g[0]-1; i>=0 && grid[i][g[1]] != 'G' && grid[i][g[1]] != 'W'; i--) {
                if(grid[i][g[1]] != 'g') ans--;
                grid[i][g[1]] = 'g';
            }
            for(int i=g[0]+1; i<m && grid[i][g[1]] != 'G' && grid[i][g[1]] != 'W'; i++) {
                if(grid[i][g[1]] != 'g') ans--;
                grid[i][g[1]] = 'g';
            }
            for(int i=g[1]-1; i>=0 && grid[g[0]][i] != 'G' && grid[g[0]][i] != 'W'; i--) {
                if(grid[g[0]][i] != 'g') ans--;
                grid[g[0]][i] = 'g';
            }
            for(int i=g[1]+1; i<n && grid[g[0]][i] != 'G' && grid[g[0]][i] != 'W'; i++) {
                if(grid[g[0]][i] != 'g') ans--;
                grid[g[0]][i] = 'g';
            }
        }
        return ans;
    }
}