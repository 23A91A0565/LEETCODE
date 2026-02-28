class Solution {
    public int swimInWater(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        PriorityQueue<int[]> q=new PriorityQueue<>((a,b)->a[0]-b[0]);
        boolean visited[][]=new boolean[n][m];
        visited[0][0]=true;
        q.offer(new int[]{grid[0][0],0,0});

        int dir[][]={{-1,0},{1,0},{0,1},{0,-1}};

        while(!q.isEmpty()){
            int p[]=q.poll();
            int curr=p[0];
            int x=p[1];
            int y=p[2];
            if(x==n-1 && y==m-1)return curr;
            for(int i=0;i<4;i++){
                int nx=dir[i][0]+x;
                int ny=dir[i][1]+y;
                if(nx>=0 && ny>=0 && nx<n && ny<m && !visited[nx][ny] ){
                    int newTime = Math.max(curr, grid[nx][ny]);
                    q.offer(new int[]{newTime,nx,ny});
                    visited[nx][ny]=true;
                }
            }
        }
        return -1;
    }
}