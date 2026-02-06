class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int fresh=0;
        int res=0;
        Queue<int[]>q=new LinkedList<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j});
                }
                if(grid[i][j]==1){
                    fresh++;
                }
            }
        }

        int dir[][]={{1,0},{-1,0},{0,1},{0,-1}};

        while(!q.isEmpty() && fresh>0){
            int size=q.size();
            res+=1;
            for(int i=0;i<size;i++){
                int s[]=q.poll();
                for(int d[]:dir){
                    int x=s[0]+d[0];
                    int y=s[1]+d[1];
                    if(x>=0 && x<n && y>=0 && y<m && grid[x][y]==1){
                        fresh--;
                        grid[x][y]=2;
                        q.offer(new int[]{x,y});
                    }
                }
            }
        }
        return fresh==0?res:-1;
    }
}