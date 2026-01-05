class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int min=Integer.MAX_VALUE,c=0;
        long total=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]<0){
                    c+=1;
                }
                min=Math.min(Math.abs(matrix[i][j]),min);
                total+=Math.abs(matrix[i][j]);
            }
        }
        if(c%2==0)return total;
        else return total-2*min;
    }
}