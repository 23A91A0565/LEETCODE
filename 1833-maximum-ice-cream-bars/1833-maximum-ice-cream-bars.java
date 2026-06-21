class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int n=costs.length;
        Arrays.sort(costs);
        int res=0;
        int i=0;
        while(i<n && costs[i]<=coins){
            coins-=costs[i];
            i++;
        }
        return i;
    }
}