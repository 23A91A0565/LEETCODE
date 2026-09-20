class Solution {
    public int reverseDegree(String s) {
        int ans=0;
        int i=1;
        for(char c:s.toCharArray()){
            int ind=c-'a'+1;
            int rev=26-ind+1;
            ans+=(i*rev);
            i++;
        }
        return ans;
    }
}