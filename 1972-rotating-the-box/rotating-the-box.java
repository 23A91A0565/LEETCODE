class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        int m=boxGrid.length,n=boxGrid[0].length;
        for(int i=0;i<m;i++){
            int empty=n-1;
            for(int j=n-1;j>=0;j--){
                if(boxGrid[i][j]=='*'){
                    empty=j-1;
                }
                else if(boxGrid[i][j]=='#'){
                    if(empty!=j){
                        boxGrid[i][empty]='#';
                        boxGrid[i][j]='.';
                    }
                    empty--;
                }
            }
        }
        char res[][]=new char[n][m];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                res[j][m-i-1]=boxGrid[i][j];
            }
        }
        return res;
    }
}