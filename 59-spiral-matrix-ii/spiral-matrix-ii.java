class Solution {
    public int[][] generateMatrix(int n) {
        int c=1;
        int res[][]=new int[n][n];
        int top=0,bottom=n-1;
        int left=0,right=n-1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                res[top][i]=c;
                c++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                res[i][right]=c;
                c++;
            }
            right--;
            if(left<=right){
                for(int i=right;i>=left;i--){
                    res[bottom][i]=c;
                    c++;
                }
            }
            bottom--;
            if(top<=bottom){
                for(int i=bottom;i>=top;i--){
                    res[i][left]=c;
                    c++;
                }
            }
            left++;
        }
        return res;
    }
}