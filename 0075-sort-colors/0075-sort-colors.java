class Solution {
    public void sortColors(int[] nums) {
        int zero=0,ones=0,twos=0;
        for(int ele:nums){
            if(ele==0){
                zero++;
            }
            else if(ele==1){
                ones++;
            }
            else{
                twos++;
            }
        }
        int i=0;
        while(zero-->0){
            nums[i++]=0;
        }
        while(ones-->0){
            nums[i++]=1;
        }
        while(twos-->0){
            nums[i++]=2;
        }
    }
}