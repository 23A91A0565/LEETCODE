class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int res=0;
        int n=cost.length;
        int j=1;
        for(int i=n-1;i>=0;i--)
        {

            if(j%3==0){
                j++;
                continue;
            }
            else{
                res+=cost[i];
                j++;
            }
        }
        return res;
    }
}