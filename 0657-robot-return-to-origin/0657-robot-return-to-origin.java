class Solution {
    public boolean judgeCircle(String moves) {
        int u=0;
        int l=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='U'){
                u++;
            }
            else if(moves.charAt(i)=='D'){
                u--;
            }
            else if(moves.charAt(i)=='L'){
                l++;
            }
            else{
                l--;
            }
        }
        return u==0 && l==0;
    }
}