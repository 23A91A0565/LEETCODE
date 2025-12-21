class Solution {
    public int numDistinct(String s, String t) {
        int n=s.length();
        int m=t.length();
        int dp[][]=new int[s.length()+1][t.length()+1];
        for(int ele[]:dp){
            Arrays.fill(ele,-1);
        }
        int ans=calculate(s,t,0,0,dp);
        return ans;
    }
    public int calculate(String s,String t,int ind1,int ind2,int dp[][]){
        if(ind2==t.length())return 1;
        if(ind1==s.length())return 0;

        if(dp[ind1][ind2]!=-1)return dp[ind1][ind2];
        
        if(s.charAt(ind1)==t.charAt(ind2)){
            int take=calculate(s,t,ind1+1,ind2+1,dp);
            int noTake=calculate(s,t,ind1+1,ind2,dp);
            dp[ind1][ind2]=take+noTake;
        }
        else{
            dp[ind1][ind2]=calculate(s,t,ind1+1,ind2,dp);
        }
        return dp[ind1][ind2];
    }
}