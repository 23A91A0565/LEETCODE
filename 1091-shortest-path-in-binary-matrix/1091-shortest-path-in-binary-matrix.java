class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n=grid.length;
        
        if(grid[0][0]==1)return -1;
        if(grid[n-1][n-1]==1)return -1;
        if(n==1)return 1;
        
        boolean visited[][]=new boolean[n][n];

        PriorityQueue<int[]> q=new PriorityQueue<>((a,b)->a[0]-b[0]);

        q.offer(new int[]{1,0,0});
        visited[0][0]=true;

        int dir[][]={{-1,0},{1,0},{0,1},{0,-1},{-1,-1},{1,1},{-1,1},{1,-1}};

        while(!q.isEmpty()){
            int a[]=q.poll();
            int dis=a[0];
            int i=a[1];
            int j=a[2];
            
            for(int k=0;k<8;k++){
                int x=i+dir[k][0];
                int y=j+dir[k][1];

                if(x>=0 && x<n && y>=0 && y<n && grid[x][y]==0 && !visited[x][y]){
                    
                    visited[x][y]=true;
                    if(x==n-1 && y==n-1){
                        return dis+1;
                    }
                    q.offer(new int[]{dis+1,x,y});
                }
            }
        }
        return -1;
    }
}