class Solution {
    public int averageValue(int[] nums) {
        int sum=0;
        int cou=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0 && nums[i]%3==0)
            {
                sum+=nums[i];
                cou+=1;
            }
        }
        if (cou!=0)return (int)sum/cou;
        return 0;
    }
}