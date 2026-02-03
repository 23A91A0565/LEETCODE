class Solution {
    public boolean isTrionic(int[] nums) {
        int n=nums.length;
        int p=0,q=0;
        int i=1;
        while(i<n && nums[i-1]<nums[i]){
            i++;
        }
        p=i-1;
        while(i<n && nums[i-1]>nums[i]){
            i++;
        }
        q=i-1;
        while(i<n && nums[i-1]<nums[i]){
            i++;
        }
        if(p!=0 && p!=q && q!=i-1 && q<n-1 && i-1==n-1){
            return true;
        }
        return false;
    }
}