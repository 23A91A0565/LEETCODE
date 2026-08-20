class Solution {
    public int maxProduct(int[] nums) {
        // int max=Integer.MIN_VALUE;
        // int lp=1;
        // int rp=1;
        // for(int i=0;i<nums.length;i++){
        //     lp*=nums[i];
        //     rp*=nums[nums.length-i-1];
        //     max=Math.max(max,Math.max(lp,rp));
        //     if(lp==0)lp=1;
        //     if(rp==0)rp=1;
        // }
        // return max;
        
        // [ OR ]
        
        int max = nums[0], min = nums[0], ans = nums[0];
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i] < 0){
                int temp = max;
                max = min;
                min = temp;
            }
            max = Math.max(nums[i], max * nums[i]);
            min = Math.min(nums[i], min * nums[i]);
            ans = Math.max(ans, max);
        }
        return ans;
    }
}