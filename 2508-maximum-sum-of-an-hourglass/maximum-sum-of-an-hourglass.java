class Solution {
    public int maxSum(int[][] grid) {
        int max=0,sum=0;
        for(int i=1;i<grid.length-1;i++){
            for(int j=1;j<grid[0].length-1;j++){
                sum=grid[i-1][j-1]+grid[i-1][j]+grid[i-1][j+1]+grid[i][j]+grid[i+1][j-1]+grid[i+1][j]+grid[i+1][j+1];
                max=Math.max(max,sum);
            }
        }
        return max;
    }
}