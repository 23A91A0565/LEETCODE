class Solution {
    public int numEnclaves(int[][] grid) {
        int n=grid.length,m=grid[0].length;
        int c=0;
        Queue<int[]> q=new LinkedList<>();
        boolean visited[][]=new boolean[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0 || j==0 || i==n-1 || j==m-1){
                    if(grid[i][j]==1 && !visited[i][j]){
                        visited[i][j]=true;
                        q.offer(new int[]{i,j});
                    }
                }
            }
        }

        int dir[][]={{0,1},{0,-1},{1,0},{-1,0}};
        while(!q.isEmpty()){
            int ele[]=q.poll();
            for(int i=0;i<4;i++){
                int x=ele[0]+dir[i][0];
                int y=ele[1]+dir[i][1];
                if(x>=0 && x<n && y>=0 && y<m){
                    if(grid[x][y]==1 && !visited[x][y]){
                        visited[x][y]=true;
                        q.offer(new int[]{x,y});
                    }
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1 && !visited[i][j]){
                    c+=1;
                }
            }
        }
        return c;
    }
}