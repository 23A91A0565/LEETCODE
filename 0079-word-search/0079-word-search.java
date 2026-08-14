class Solution {
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        boolean vis[][]=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]==word.charAt(0)){
                    if(solve(i,j,board,word,1,vis)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public boolean solve(int i,int j,char board[][],String word,int k,boolean vis[][]){
        if(k>=word.length()){
            return true;
        }
        vis[i][j]=true;
        boolean ans=false;
        int dir[][]={{-1,0},{1,0},{0,1},{0,-1}};
        for(int ele[]:dir){
            int x=ele[0];
            int y=ele[1];
            int nx=i+x;
            int ny=j+y;
            if(nx>=0 && nx< board.length && ny>=0 && ny<board[0].length && board[nx][ny]==word.charAt(k) && !vis[nx][ny]){
                if(solve(nx,ny,board,word,k+1,vis)){
                    return true;
                }
            }
        }
        vis[i][j]=false;
        return ans;
    }
}