class Solution {
    public int countBinarySubstrings(String s) {
        int res=0;
        int prev=0,curr=0;
        int i=0,j=0;
        while(i<s.length()){
            char c=s.charAt(i);
            j=i;
            while(j<s.length() && s.charAt(j)==c){
            j++;
            }
            prev=curr;
            curr=j-i;
            i=j;
            res+=Math.min(prev,curr);
        }
        return res;
    }
}