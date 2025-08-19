class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long max=0;
        long c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                c+=1;
                max+=c;
            }
            else{
                c=0;
            }
        }
        return max;
    }
}