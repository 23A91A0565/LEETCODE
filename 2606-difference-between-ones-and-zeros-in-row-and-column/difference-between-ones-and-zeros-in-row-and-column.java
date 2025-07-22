class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int ones_row[]=new int[grid.length];
        int ones_col[]=new int[grid[0].length];
        int ans[][]=new int[grid.length][grid[0].length];

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    ones_row[i]++;
                    ones_col[j]++;
                }
            }
        }

        /*for(int i=0;i<grid.length;i++)
        {
            int ones=0;
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                {
                   ones+=1;
                }
            }
            ones_row[i]=ones;
        }

        for(int j=0;j<grid[0].length;j++)
        {
            int ones=0;
            for(int i=0;i<grid.length;i++)
            {
                if(grid[i][j]==1)
                {
                ones+=1;
                }
            }
            ones_col[j]=ones;
        }*/

        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                ans[i][j]=ones_row[i]+ones_col[j]-(grid.length-ones_row[i])-(grid[0].length-ones_col[j]);
            }
        }
        return ans;
    }
}