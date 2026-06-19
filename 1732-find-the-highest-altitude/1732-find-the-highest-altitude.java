class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int prev=0;
        int max=0;
        for(int i=0;i<n;i++){
            prev+=gain[i];
            max=Math.max(max,prev);
        }
        return max;

    }
}