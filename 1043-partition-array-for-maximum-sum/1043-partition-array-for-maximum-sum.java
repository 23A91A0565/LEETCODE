class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int dp[]=new int[arr.length+1];
        for(int i=1;i<arr.length+1;i++){
            int curr=0;
            int total=0;
            for(int j=1;j<=k && i-j>=0 ;j++){
                curr=Math.max(curr,arr[i-j]);
                total=Math.max(total,dp[i-j]+curr*j);
            }
            dp[i]=total;
        }
        return dp[arr.length];
    }
}