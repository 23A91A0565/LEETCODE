class Solution {
    public int scoreDifference(int[] nums) {
        int f=0,s=0;
        int flag=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){
                if(flag==0){
                    flag=1;
                }
                else{
                    flag=0;
                }
            }
            if((i+1)%6==0){
                if(flag==0){
                    flag=1;
                }
                else{
                    flag=0;
                }
            }
            if(flag==0){
                f+=nums[i];
            }
            if(flag==1){
                s+=nums[i];
            }
        }
        return f-s;
    }
}