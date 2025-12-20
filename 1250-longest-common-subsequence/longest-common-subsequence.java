class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
        int dp[][]=new int[n][m];
        for(int ele[]:dp){
            Arrays.fill(ele,-1);
        }
        int res=calculate(text1,text2,n-1,m-1,dp);
        return res;
    }
    public static int calculate(String s1,String s2,int ind1,int ind2,int dp[][]){
        if(ind1<0 || ind2<0){
            return 0;
        }
        if(dp[ind1][ind2]!=-1){
            return dp[ind1][ind2];
        }
        if(s1.charAt(ind1)==s2.charAt(ind2)){
            dp[ind1][ind2]=1+calculate(s1,s2,ind1-1,ind2-1,dp);
        }
        else{
            dp[ind1][ind2]=Math.max(
                calculate(s1,s2,ind1-1,ind2,dp),
                calculate(s1,s2,ind1,ind2-1,dp)
            );
        }
        return dp[ind1][ind2];
    }
}