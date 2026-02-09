class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        Queue<int[]> q=new LinkedList<>();
        int dist[][]=new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    dist[i][j]=0;
                    q.offer(new int[]{i,j});
                }
                else{
                    dist[i][j]=Integer.MAX_VALUE;
                }
            }
        }

        int dir[][]={{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            int curr[]=q.poll();
            for(int k=0;k<4;k++){
                int x=curr[0]+dir[k][0];
                int y=curr[1]+dir[k][1];
                if(x>=0 && y>=0 && x<n && y<m){
                    if(dist[x][y]>dist[curr[0]][curr[1]]+1){
                        dist[x][y]=dist[curr[0]][curr[1]]+1;
                        q.offer(new int[]{x,y});
                    }
                }
            }
        }

        return dist;
    }
}