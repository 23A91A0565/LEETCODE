class Solution {
    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        int n=grid.size(),m=grid.get(0).size();
        int[][] best=new int[n][m];
        for(int[] row:best) Arrays.fill(row,-1);

        int start=health-grid.get(0).get(0);
        if(start<=0) return false;

        Queue<int[]> q=new LinkedList<>();
        q.offer(new int[]{0,0,start});
        best[0][0]=start;

        int[][] dir={{1,0},{-1,0},{0,1},{0,-1}};

        while(!q.isEmpty()){
            int[] cur=q.poll();
            int x=cur[0],y=cur[1],h=cur[2];

            if(x==n-1 && y==m-1) return true;

            for(int[] d:dir){
                int nx=x+d[0],ny=y+d[1];

                if(nx<0||ny<0||nx>=n||ny>=m) continue;

                int nh=h-grid.get(nx).get(ny);

                if(nh>0 && nh>best[nx][ny]){
                    best[nx][ny]=nh;
                    q.offer(new int[]{nx,ny,nh});
                }
            }
        }

        return false;


    //     int n=grid.size();
    //     int m=grid.get(0).size();
    //     int dp[][][]=new int[n][m][health+1];
    //     boolean vis[][]=new boolean[n][m];
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<m;j++){
    //             Arrays.fill(dp[i][j],-1);
    //         }
    //     }
    //     int res=solve(grid,health,dp,0,0,vis);
    //     return res>=1;
    // }
    // public static int solve(List<List<Integer>> grid,int h,int dp[][][],int i,int j,boolean vis[][]){
    //     int dir[][]={{1,0},{-1,0},{0,1},{0,-1}};
    //     int n=grid.size();
    //     int m=grid.get(0).size();
    //     if(i==grid.size()-1 && j==grid.get(0).size()-1 && h>=1)return 1;
    //     if(vis[i][j])continue;
    //     vis[i][j]=true;
    //     if(dp[i][j][h]!=-1)return dp[i][j][h];
    //     if(h<=0)return 0;
    //     int ans=0;
    //     for(int d[]:dir){
    //         int nx=i+d[0];
    //         int ny=j+d[1];
    //         if(nx>=0 && nx<n && ny>=0 && ny<m){
    //             if(grid.get(nx).get(ny)==1){
    //                 ans+=solve(grid,h-1,dp,nx,ny);
    //             }
    //             else{
    //                 ans+=solve(grid,h,dp,nx,ny);
    //             }
    //         }
    //     }
    //     return dp[i][j][h]=ans;
    }
}










