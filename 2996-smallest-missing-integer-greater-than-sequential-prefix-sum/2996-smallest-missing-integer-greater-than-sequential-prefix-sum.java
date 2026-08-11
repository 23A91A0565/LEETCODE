class Solution {
    public int missingInteger(int[] nums) {
        int sum=nums[0];
        HashSet<Integer> h=new HashSet<>();
        for(int ele:nums){
            h.add(ele);
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]+1==nums[i]){
                sum+=nums[i];
            }
            else{
                break;
            }
        }
        while(h.contains(sum)){
            sum++;
        }
        return sum;
    }
}