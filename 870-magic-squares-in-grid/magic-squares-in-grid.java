class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int c=0;
        for(int i=0;i<n-2;i++){
            for(int j=0;j<m-2;j++){
                if(isSafe(grid,i,j)){
                    c+=1;
                }
            }
        }
        return c;
    }
    public boolean isSafe(int grid[][],int row,int col){
        int sum=grid[row][col]+grid[row][col+1]+grid[row][col+2];
        HashSet<Integer> store=new HashSet<>();

        for(int i=row;i<row+3;i++){
            for(int j=col;j<col+3;j++){
                if(grid[i][j]>9 || grid[i][j]<1 ||store.contains(grid[i][j]))return false;
                store.add(grid[i][j]);
            }
        }

        for(int i=0;i<3;i++){
            if(grid[row][col+i]+grid[row+1][col+i]+grid[row+2][col+i]!=sum)return false;
            if(grid[row+i][col]+grid[row+i][col+1]+grid[row+i][col+2]!=sum)return false;
        }

        if(grid[row][col]+grid[row+1][col+1]+grid[row+2][col+2]!=sum)return false;
        if(grid[row][col+2]+grid[row+1][col+1]+grid[row+2][col]!=sum)return false;

        return true;
    }
}