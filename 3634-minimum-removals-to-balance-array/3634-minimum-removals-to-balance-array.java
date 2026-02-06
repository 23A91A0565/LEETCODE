class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        // if(nums.length==1){
        //     return 0;
        // }
        // if(nums.length==2){
        //     if(nums[0]*k>=nums[1]){
        //         return 0;
        //     }
        //     else{
        //         return 1;
        //     }
        // }
        int ans=0;
        int i=0,j=0;
        while(i<nums.length){
            while(j<nums.length && nums[j]<=(long)k*nums[i]){
                j++;
            }
            ans=Math.max(ans,j-i);
            i++;
        }
        return nums.length-ans;
    }
}