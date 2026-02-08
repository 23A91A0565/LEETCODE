class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        Queue<int[]> q=new LinkedList<>();
        boolean visited[][]=new boolean[n][m];

        int c=0;

        int dir[][]={{1,0},{-1,0},{0,1},{0,-1}};

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1' && !visited[i][j]){
                    visited[i][j]=true;
                    c+=1;
                    q.offer(new int[]{i,j});
                    while(!q.isEmpty()){
                        int p[]=q.poll();
                        for(int k=0;k<4;k++){
                            int x=p[0]+dir[k][0];
                            int y=p[1]+dir[k][1];
                            if(x>=0 && x<n && y>=0 && y<m){
                                if(grid[x][y]=='1' && !visited[x][y]){
                                    visited[x][y]=true;
                                    q.offer(new int[]{x,y});
                                }
                            }
                        }
                    }
                }
            }
        }
        return c;
    }
}