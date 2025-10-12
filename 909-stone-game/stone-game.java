class Solution {
    public boolean stoneGame(int[] piles) {
        int i=0,j=piles.length-1;
        int alice=0,bob=0;
        boolean turn=true;
        while(i<j){
            int opt=Math.max(piles[i],piles[j]);
            if(piles[i]>=piles[j]) i++;
            else j--;
            if(turn) alice+=opt;
            else bob+=opt;
        }
        return alice>bob;
    }
}