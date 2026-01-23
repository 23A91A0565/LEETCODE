class Solution {
    public int minCut(String s) {
        int dp[]=new int[s.length()+1];
        int n=s.length();
        dp[n]=-1;
        for(int i=n-1;i>=0;i--){
            int min=Integer.MAX_VALUE;
            for(int j=i;j<n;j++){
                if(isPalin(s,i,j)){
                    min=Math.min(min,1+dp[j+1]);
                }
            }
            dp[i]=min;
        }
        return dp[0];

    }
    public boolean isPalin(String s,int i,int j){
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}