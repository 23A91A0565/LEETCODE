class Solution {
    public int smallestBalancedIndex(int[] nums) {
        int n=nums.length;
        long prev[]=new long[n];
        long suff[]=new long[n];
        prev[0]=nums[0];
        suff[n-1]=nums[n-1];
        for(int i=1;i<n;i++){
            prev[i]=prev[i-1]+nums[i];
        }
        long ove=(long)1e14;
        for(int i=n-2;i>=0;i--){
            if(suff[i+1]>ove/nums[i]){
                suff[i]=ove+1;
            }
            else{
                suff[i]=nums[i]*suff[i+1];
            }
        }
        for(int i=0;i<n;i++){
            long p=(i-1<0)?0:prev[i-1];
            long s=(i+1>=n)?1:suff[i+1];
            if(p==s)return i;
        }
        return -1;
    }
}