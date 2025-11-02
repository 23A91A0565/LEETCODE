class Solution {
    public int uniquePaths(int m, int n) {
        int prev[]=new int[m];
        Arrays.fill(prev,-1);
        for(int i=0;i<n;i++){
            int curr[]=new int[m];
            for(int j=0;j<m;j++){
                if(i==0 && j==0)curr[j]=1;
                if(j>0)curr[j]+=curr[j-1];
                if(i>0)curr[j]+=prev[j];
            }
            prev=curr;
        }
        return prev[m-1];
    }
}