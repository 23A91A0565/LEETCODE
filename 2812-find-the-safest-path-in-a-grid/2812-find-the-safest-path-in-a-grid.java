class Solution {
    public int maximumSafenessFactor(List<List<Integer>> grid) {
        int n=grid.size();
        int m=grid.get(0).size();
        if(grid.get(0).get(0)==1 || grid.get(n-1).get(m-1)==1)return 0;
        int dist[][]=new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(dist[i],-1);
        }

        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid.get(i).get(j)==1){
                    dist[i][j]=0;
                    q.offer(new int[]{i,j});
                }
            }
        }
        int dir[][]={{1,0},{-1,0},{0,1},{0,-1}};

        while(!q.isEmpty()){
            int cur[]=q.poll();
            for(int d[]:dir){
                int x=cur[0]+d[0];
                int y=cur[1]+d[1];
                if(x>=0 && x<n && y>=0 && y<m && dist[x][y]==-1){
                    dist[x][y]=dist[cur[0]][cur[1]]+1;
                    q.offer(new int[]{x,y});
                }
            }
        }

        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->b[0]-a[0]);
        boolean vis[][]=new boolean[n][m];
        pq.offer(new int[]{dist[0][0],0,0});
        while(!pq.isEmpty()){
            int curr[]=pq.poll();
            int val=curr[0];
            int x=curr[1];
            int y=curr[2];

            if(x==n-1 && y==m-1)return val;

            if(vis[x][y])continue;
            vis[x][y]=true;
            for(int d[]:dir){
                int nx=x+d[0];
                int ny=y+d[1];

                if(nx>=0 && nx<n && ny>=0 && ny<m && !vis[nx][ny]){
                    int newVal=Math.min(val,dist[nx][ny]);
                    pq.offer(new int[]{newVal,nx,ny});
                }
            }
        }
        return 0;
    }
}