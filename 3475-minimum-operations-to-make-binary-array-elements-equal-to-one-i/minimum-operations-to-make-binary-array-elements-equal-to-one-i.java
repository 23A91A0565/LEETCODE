class Solution {
    public int minOperations(int[] nums) {
        int c=0;
        if(check(nums))
        {
            return 0;
        }
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]==0){
                nums[i]=1-nums[i];
                nums[i+1]=1-nums[i+1];
                nums[i+2]=1-nums[i+2];
                c+=1;
            }
        }
        if(check(nums)){
            return c;
        }
        else{
            return -1;
        }
    }
    public boolean check(int nums[]){
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=1){
                return false;
            }
        }
        return true;
    }
}