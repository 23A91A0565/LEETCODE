class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n=obstacleGrid.length;
        int m=obstacleGrid[0].length;
        int pre[]=new int[m];
        for(int i=0;i<n;i++){
            int curr[]=new int[m];
            for(int j=0;j<m;j++){
                if(i==0 && j==0)curr[j]=1;
                if(i>0)curr[j]+=pre[j];
                if(j>0)curr[j]+=curr[j-1];
                if(obstacleGrid[i][j]==1)curr[j]=0;
            }
            pre=curr;
        }
        return pre[m-1];
    }
}