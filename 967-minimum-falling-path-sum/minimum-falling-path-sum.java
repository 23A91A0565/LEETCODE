class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int[] prev = new int[n];
        for (int j = 0; j < n; j++) {
            prev[j] = matrix[0][j];
        }
        for (int i = 1; i < n; i++) {
            int[] curr = new int[n];
            for (int j = 0; j < n; j++) {
                int up=prev[j];
                int leftDiag=(j>0)?prev[j-1]:Integer.MAX_VALUE;
                int rightDiag=(j<n-1)?prev[j+1]:Integer.MAX_VALUE;
                curr[j]=matrix[i][j]+Math.min(up,Math.min(leftDiag,rightDiag));
            }
            prev=curr;
        }
        int ans=Integer.MAX_VALUE;
        for (int x : prev) 
            ans=Math.min(ans,x);
        return ans;
    }
}