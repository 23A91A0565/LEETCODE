class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(n*m != original.length)
        {
            return new int[0][0];
        }
        int a[][]=new int[m][n];
        int c=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=original[c];
                c+=1;
            }
        }
        return a;
    }
}