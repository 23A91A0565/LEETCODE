class Solution {
    public int minElement(int[] nums) {
        int n=nums.length;
        int sm=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int dig=nums[i];
            int sum=0;
            while(dig!=0){
                int r=dig%10;
                sum+=r;
                dig=dig/10;
            }
            sm=Math.min(sm,sum);
        }
        return sm;
    }
}