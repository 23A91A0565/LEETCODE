class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        long ans=0;
        long con=0;
        Arrays.sort(happiness);
        for(int i=happiness.length-1;i>=0;i--){
            if(k<=0){
                break;
            }
            else{
                long res=happiness[i]-con;
                if(res>=0){
                    ans+=res;
                }
                con+=1;
                k-=1;
            }
        }
        return ans;
    }
}