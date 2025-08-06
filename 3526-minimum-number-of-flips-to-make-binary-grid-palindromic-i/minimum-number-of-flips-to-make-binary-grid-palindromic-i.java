class Solution {
    public int minFlips(int[][] grid) {
        int rows=0,cols=0;
        for(int i=0;i<grid.length;i++)
        {
            int start=0,end=grid[0].length-1;
            while(start<=end)
            {
                if(grid[i][start]!=grid[i][end])
                {
                    rows+=1;
                }
                start++;
                end--;
            }
        }

        for(int i=0;i<grid[0].length;i++)
        {
            int start=0,end=grid.length-1;
            while(start<=end)
            {
                if(grid[start][i]!=grid[end][i])
                {
                    cols+=1;
                }
                start++;
                end--;
            }
        }
        return Math.min(rows,cols);
    }
}