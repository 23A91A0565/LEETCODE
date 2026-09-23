class Solution {
    public int minOperations(int[] nums, int x) {
        int n=nums.length;
        int total_sum=0;
        for(int i=0;i<n;i++){
            total_sum+=nums[i];
        }
        int rem=total_sum-x;
        int sum=0;
        int i=0,j=0;
        int ans=-1;
        while(j<n){
            sum+=nums[j];
            while(i<n && sum>rem){
                sum-=nums[i];
                i++;
            }
            if(sum==rem){
                ans=Math.max(ans,j-i+1);
            }
            j++;
        }
        return ans==-1?-1:n-ans;
    }
}