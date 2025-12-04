class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int mat[][]=new int[n][n];
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=c;
                c++;
            }
        }
        int i=0,j=0;
        for(int k=0;k<commands.size();k++){
            if(commands.get(k).equals("RIGHT")){
                j+=1;
            }
            else if(commands.get(k).equals("LEFT")){
                j-=1;
            }
            else if(commands.get(k).equals("UP")){
                i-=1;
            }
            else{
                i+=1;
            }
        }
        return mat[i][j];
    }
}