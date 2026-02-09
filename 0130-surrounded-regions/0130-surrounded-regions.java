class Solution {
    public void solve(char[][] board) {
        int n=board.length;
        int m=board[0].length;
        Queue<int[]> q=new LinkedList<>();
        boolean visited[][]=new boolean[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0 || j==0 || i==n-1 || j==m-1){
                    if(board[i][j]=='O'){
                        visited[i][j]=true;
                        q.offer(new int[]{i,j});
                    }
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
                    if(board[x][y]=='O' && !visited[x][y]){
                        visited[x][y]=true;
                        q.offer(new int[]{x,y});
                    }
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]=='O' && !visited[i][j]){
                    board[i][j]='X';
                }
            }
        }
    }
}