class Solution {
    public boolean predictTheWinner(int[] nums) {
        int ans=0;
        int n=nums.length;
        ans=solve(nums,0,n-1);
        return ans>=0;
    }
    public int solve(int nums[],int l,int h){
        if(l==h)return nums[l];
        int ans1=nums[l]-solve(nums,l+1,h);
        int ans2=nums[h]-solve(nums,l,h-1);
        return Math.max(ans1,ans2);
    }
}