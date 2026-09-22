class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        int i=0;
        while(i<nums.length){
            if(i>0){
                while(i<nums.length && nums[i]==nums[i-1]){
                    i++;
                }
            }
            if(i<nums.length){
                nums[k++]=nums[i];
            }
            i++;
        }
        return k;
    }
}