class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int res=0;
        int n=patterns.length;
        for(int i=0;i<n;i++){
            if(word.indexOf(patterns[i])!=-1)res+=1;
        }
        return res;
    }
}