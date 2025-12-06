class Solution {
    public int splitArray(int[] nums, int k) {
        int low=Arrays.stream(nums).max().getAsInt();
        int high=Arrays.stream(nums).sum();
        while(low<=high){
            int mid=(low+high)/2;
            int count=partitions(nums,mid);
            if(count>k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
    public int partitions(int nums[],int val){
        int k=1,pre=0;
        for(int i=0;i<nums.length;i++){
            if(pre+nums[i]>val){
                k+=1;
                pre=0;
            }
            pre+=nums[i];
        }
        return k;
    }
}