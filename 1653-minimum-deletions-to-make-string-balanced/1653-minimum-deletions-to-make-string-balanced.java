class Solution {
    public int minimumDeletions(String s) {
        int res=0;
        int bC=0;
        for(char c:s.toCharArray()){
            if(c=='b'){
                bC++;
            }
            else{
                res=Math.min(res+1,bC);
            }
        }
        return res;
    }
}