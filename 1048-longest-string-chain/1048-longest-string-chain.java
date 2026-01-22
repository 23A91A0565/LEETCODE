class Solution {
    public int longestStrChain(String[] words) {
        Arrays.sort(words,(s1,s2)->Integer.compare(s1.length(),s2.length()));
        int dp[]=new int[words.length];
        Arrays.fill(dp,1);
        int max=0;
        for(int i=0;i<words.length;i++){
            for(int j=0;j<i;j++){
                if(isPossible(words[i],words[j]) && dp[i]<dp[j]+1){
                    dp[i]=dp[j]+1;
                }
            }
            if(dp[i]>max){
                max=dp[i];
            }
        }
        return max;
    }
    public boolean isPossible(String a,String b){
        if(a.length()!=b.length()+1)return false;
        int i=0,j=0;
        while(i<a.length() && j<b.length()){
            if(a.charAt(i)==b.charAt(j)){
                i++;
                j++;
            }
            else{
                i++;
            }
        }
        if(j==b.length())return true;
        return false;
    }
}