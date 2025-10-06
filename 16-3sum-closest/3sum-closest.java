class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int close=Integer.MAX_VALUE;
        for(int i=0;i<nums.length-2;i++){
            int st=i+1,end=nums.length-1;
            while(st<end){
                int sum=nums[i]+nums[st]+nums[end];
                if(sum-target==0){
                    return sum;
                }
                else if(Math.abs(sum-target)<Math.abs(close-target)){
                    close=sum;
                }
                else if(sum>target){
                    end--;
                }
                else{
                    st++;
                }
            }
        }
        return close;
    }
}